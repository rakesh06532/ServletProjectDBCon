package test;

import java.util.*;
import java.sql.*;

public class RetrieveDAO {
	ArrayList<StudentBean> al=new ArrayList<StudentBean>();
	public ArrayList<StudentBean> insert() {
		try {
			Connection con= DBConnection.getcon();
			PreparedStatement ps=con.prepareStatement
					("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setStudentId(rs.getInt(1));
				sb.setStudentName(rs.getString(2));
				sb.setMath(rs.getInt(3));
				sb.setEnglish(rs.getInt(4));
				sb.setHindi(rs.getInt(5));
				sb.setScience(rs.getInt(6));
				sb.setSocscience(rs.getInt(7));
				sb.setSanskrit(rs.getInt(8));
				al.add(sb);
			}
		}catch(Exception e) { e.printStackTrace();}
		return al;
	}

}
