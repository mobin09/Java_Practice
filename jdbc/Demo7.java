package jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

class Demo7 {

	static Map<String, String> getAccountHolderDetails(int acc) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		HashMap<String, String> getData = new HashMap<String, String>();
		try {

			con = DBUtils.getConnection();
			String qry = "SELECT NAME, TOTAL_BAL FROM ACC_DETAILS WHERE ACC_NO = ?";
			pstmt = con.prepareStatement(qry);
			pstmt.setInt(1, acc);
			rs = pstmt.executeQuery();
			String name = "";
			String total_bal = "";
			boolean isDataParesent = false;
			if (rs.next()) {
				name = rs.getString(1);
				total_bal = String.valueOf(rs.getDouble(2));
				isDataParesent = true;
			}

			if (isDataParesent) {
				getData.put("NAME", name);
				getData.put("TOTAL_BALANCE", total_bal);
				getData.put("ACC_NO", String.valueOf(acc));
				getData.put("STATUS", "PASS");
				System.out.println("WELCOME TO SEND MONEY MR. " + name);
			} else {
				System.out.println("Please Open the Account First");
				getData.put("STATUS", "NO_ACC");
			}

			// System.out.println(getData);
		} catch (SQLException e) {
			getData.put("STATUS", "FAIL");
			e.printStackTrace();
		}
		;
		return getData;
	}

	public static String performTransaction(int amt, int sender, int benAcc) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String res = "";

		try {

			String query = "UPDATE ACC_DETAILS set TOTAL_BAL = TOTAL_BAL - ? WHERE ACC_NO = ? ";
			con = DBUtils.getConnection();
			con.setAutoCommit(false);
			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, amt);
			pstmt.setInt(2, sender);
			int i = pstmt.executeUpdate();

			String query2 = "INSERT INTO TRNS_DETAILS VALUES(?,?,?)";
			pstmt = con.prepareStatement(query2);

			pstmt.setInt(1, benAcc);
			pstmt.setDouble(2, sender);
			pstmt.setInt(3, amt);
			int j = pstmt.executeUpdate();

			String query3 = "UPDATE ACC_DETAILS set TOTAL_BAL = TOTAL_BAL + ? WHERE ACC_NO = ? ;";
			pstmt = con.prepareStatement(query3);
			pstmt.setDouble(1, amt);
			pstmt.setInt(2, benAcc);
			int k = pstmt.executeUpdate();
			int result = i + j + k;
			System.out.println("i:" + i + ", j:" + j + ", k:" + k);
			if (result == 3) {
				con.commit();
				res = "SUCCESS";
			} else {
				con.rollback();
				res = "FAIL";
			}

		} catch (Exception e) {
			e.printStackTrace();
			res = "FAIL";
		}

		return res;

	}

	public static void main(String[] args) {
		BufferedReader br = null;
		System.out.println("**WELCOME TO MONEY TRANSFER**");
		try {
			System.out.println("Please enter the Account no.");
			br = new BufferedReader(new InputStreamReader(System.in));
			int acc = Integer.parseInt(br.readLine());
			Map<String, String> cusDetails = getAccountHolderDetails(acc);
			if (cusDetails.get("STATUS").equalsIgnoreCase("PASS")) {
				System.out.println("Do You Want to send the Money [YES/NO]");
				br = new BufferedReader(new InputStreamReader(System.in));
				String des = br.readLine();
				if (des.equalsIgnoreCase("YES")) {
					System.out.println("Please Enter the Beneficiary Account");
					int ben_acc = Integer.parseInt(br.readLine());
					Map<String, String> ben_map = getAccountHolderDetails(ben_acc);
					if (!ben_map.get("STATUS").equalsIgnoreCase("PASS")) {
						System.out.println("Some Issues Please Try Again");
					} else {
						System.out.println("Enter Ammount to Transfer");
						int amt = Integer.parseInt(br.readLine());
						if (amt <= Double.parseDouble(cusDetails.get("TOTAL_BALANCE"))) {

							String status = performTransaction(amt, Integer.parseInt(cusDetails.get("ACC_NO")),
									ben_acc);
							if (status == "SUCCESS") {
								System.out.println("Transaction successfully");
							} else {
								System.out.println("Some Issues Occured");
							}

						} else {
							System.out.println("Insufficient Ballance");
						}
					}

				}

			} else if (cusDetails.get("STATUS").equalsIgnoreCase("FAIL")) {
				System.out.println("REELOOK the Code Please");
			} else {
				System.out.println(cusDetails.get("STATUS"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
