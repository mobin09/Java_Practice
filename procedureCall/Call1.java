package procedureCall;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.CallableStatement;

import jdbc.DBUtils;

public class Call1 {

	public static void main(String[] args) {
		
		//String procedureName = "{GET_PRODUCT_DETAILS (?, ?, ?, ?)}";
		try {
			Connection con = DBUtils.getConnection();
			CallableStatement cstmt = con.prepareCall("{GET_PRODUCT_DETAILS(?,?)}");
			cstmt.setInt(1, 1);
			// Setting the output values
			cstmt.registerOutParameter(2,Types.VARCHAR);
//			cstmt.registerOutParameter(3, Types.DOUBLE);
//			cstmt.registerOutParameter(4, Types.INTEGER);

			cstmt.execute();

			// Retrieve the results
			//String prodName = cstmt.getString(2);
//			Double price = cstmt.getDouble(3);
//			Integer qnty = cstmt.getInt(4);

			System.out.println("Product Name: " + cstmt.getString(2) + " Price: " + "" + " Quantity: " );

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
