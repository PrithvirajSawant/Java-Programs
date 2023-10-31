package Pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = (DriverManager.getConnection("Url","UserName","ps"));
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * ");
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String loc = rs.getString(3);
			
		}
		con.close();
	}

}
