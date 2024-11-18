package mySecondApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServelet extends HttpServlet{
	private PrintWriter pw; 

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		pw=resp.getWriter();
		pw.print("<html><body><center>");
		pw.print("this is Second Servelet");
		pw.print("</center></body></html>");
	}
}
