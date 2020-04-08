package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetJob
 */
public class GetJob extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String city = request.getParameter("city");
		String tech = request.getParameter("technology");
		
		String jobprofile = new JobService().getJob(city, tech);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(jobprofile == null)
		{
			RequestDispatcher rd = request.getRequestDispatcher("/MyForm.html");
			out.print("No Jobs Available in "+city+" for the technology "+tech+" !!!");
			out.print("<br>Please Try Again!!");
			rd.include(request, response);
		}
		else
		{
			request.setAttribute("profile", jobprofile);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayResponse");
			rd.include(request, response);
		}
	}

}
