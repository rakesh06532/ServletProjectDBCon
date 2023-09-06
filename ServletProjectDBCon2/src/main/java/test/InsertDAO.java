package test;

import java.sql.*;

public class InsertDAO {
	public int k=0;
	
	public int insert(StudentBean pb) {
		try {
			Connection con=DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement
					("insert into student values(?,?,?,?,?,?,?,?)");
			
			ps.setInt(1, pb.getStudentId());
			ps.setString(2, pb.getStudentName());
			ps.setInt(3, pb.getMath());
			ps.setInt(4, pb.getEnglish());
			ps.setInt(5, pb.getHindi());
			ps.setInt(6, pb.getScience());
			ps.setInt(7, pb.getSocscience());
			ps.setInt(8, pb.getSanskrit());
			
			k=ps.executeUpdate();
			
		}catch(Exception e) {e.printStackTrace();}
		return k;
	}

}
