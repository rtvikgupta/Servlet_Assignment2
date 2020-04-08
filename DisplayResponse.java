package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayResponse
 */
public class DisplayResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String city = request.getParameter("city");
		String tech = request.getParameter("technology");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body><table>");
		out.print("<tr><td>City: </td><td>"+city+"</td></tr>");
		out.print("<tr><td>Technology: </td><td>"+tech+"</td></tr>");
		out.print("<tr><td>Job Profile: </td><td>"+request.getAttribute("profile")+"</td></tr>");
		out.print("</table></body></html>");
		
	}

}
