package test;

import javax.servlet.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewStudent extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)
	   throws IOException, ServletException {
		try {
			ArrayList<StudentBean> al= new RetrieveDAO().insert();
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			
			if(al.size()==0) {
				pw.println("Students not available...<br>");
			}
			else {
				Iterator<StudentBean> it= al.iterator();
				while(it.hasNext()) {
					StudentBean sb=(StudentBean)it.next();
					pw.println(sb.getStudentId()+"&nbsp&nbsp"+sb.getStudentName()
					+"&nbsp&nbsp"+sb.getMath()+"&nbsp&nbsp"+sb.getEnglish()+"&nbsp&nbsp"
					+sb.getHindi()+"&nbsp&nbsp"+sb.getScience()+"&nbsp&nbsp"+sb.getSocscience()
					+"&nbsp&nbsp"+sb.getSanskrit()+"<br>");
					
				}
			}
			}catch(Exception e) { e.printStackTrace();}
		RequestDispatcher rd=req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}
	

}
