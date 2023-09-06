package test;

import java.sql.*;

public class UpdateDAO {
	public int k=0;
	public int insert(StudentBean sb) {
		try {
		Connection con=DBConnection.getcon();
		PreparedStatement ps1=con.prepareStatement
				("update student set sid=? where sid=?");
		//PreparedStatement ps2=con.prepareStatement
			//	("select * from student where sid=?");
	
				
		k=ps1.executeUpdate();
		
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
