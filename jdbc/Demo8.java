package jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
class Demo8 {

	public static void main(String[] args) {
			Connection con = null;
			Statement stmt = null;
			ResultSet rs = null;
		try {
			con = DBUtils.getConnection();
			String query  = "select id, name, salary from employee";
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = stmt.executeQuery(query);
			System.out.println("ID\t NAME\t SALARY");
			// forward directions
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));			
			}
			// backward direction
			System.out.println("Previous Direction");
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));
			}
			
			System.out.println();
			rs.last(); // cursor will move to the last record
			System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));
			
			rs.first();// cursor will move to the first record
			System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));
			
			rs.absolute(3);// cursor will moved to the 3rd record from start
			System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));
			
           rs.relative(2); // currently cursor is at 3rd row now it will move to 3+2th row
           System.out.println(rs.getInt(1)+"\t " +rs.getString(2)+"\t "+ rs.getInt(3));
			
           // if we give +ve number to absolute() it moves from to down for negative number down to top
           // in case of relative() w.r.t current position +ve means move forward and -ve means move backward
           
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
