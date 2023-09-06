package test;

import javax.servlet.*;
import java.io.*;
import javax.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateStudent extends GenericServlet {
	public void service(ServletRequest req,ServletResponse res)
	   throws IOException, ServletException {
		
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		StudentBean sb=new StudentBean();
		sb.setStudentId(Integer.parseInt(req.getParameter("id")));
		
		int k=new UpdateDAO().insert(sb);
		if(k>0) {
			pw.println("Table Update Successfully...");
		}
		RequestDispatcher rd=req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}
   
}
