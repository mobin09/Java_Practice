package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Demo1 {

	public static int insertData() {
		Connection con = null;
		Statement stmt = null;
		int j = 0;
		try {
			String query = "INSERT INTO students (id, name,course, address) "
					+ "VALUE(105, 'Washim Arshad','Accounting','RahmatNagar')";
			con = DBUtils.getConnection();
			stmt = con.createStatement();
		  int i=stmt.executeUpdate(query);
		  System.out.println(1 + "Data inserted");
		  j = 1;
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return j;
	}
	
	
	public static void getData() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtils.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from students");
			while(rs.next()) {
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				String course  = rs.getString(3);
				String address = rs.getString(4);
				System.out.println("Id:"+id+"\nName:"+name+"\nCourse:"+course+"\nAddress:"+address);
				System.out.println("****************");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	
	public static void main(String[] args) {
	  //int r= insertData();
	  //System.out.println(r);
		getData();
	}

}
