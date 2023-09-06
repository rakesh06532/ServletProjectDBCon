package test;

import javax.servlet.*;
import javax.servlet.annotation.*;

import java.io.*;
@SuppressWarnings("serial")
@WebServlet("/add")

public class AddStudent extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res)
	   throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		StudentBean sb=new StudentBean();
		sb.setStudentId(Integer.parseInt(req.getParameter("SId")));
		sb.setStudentName(req.getParameter("SName"));
		sb.setMath(Integer.parseInt(req.getParameter("math")));
		sb.setEnglish(Integer.parseInt(req.getParameter("english")));
		sb.setHindi(Integer.parseInt(req.getParameter("hindi")));
		sb.setScience(Integer.parseInt(req.getParameter("science")));
		sb.setSocscience(Integer.parseInt(req.getParameter("socscience")));
		sb.setSanskrit(Integer.parseInt(req.getParameter("sanskrit")));
		
		int k=new InsertDAO().insert(sb);
		if(k>0) {
			pw.println("Student added Successfully...<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("home.html");
		rd.include(req, res);
	}
	

}
