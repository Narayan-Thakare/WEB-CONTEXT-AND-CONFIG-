import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Param extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		//For init param
		ServletConfig config=getServletConfig();
		String name=config.getInitParameter("i");
		out.print(" this is Init param ");

		out.print("Welcome to "+name);
//		///////////////////////////////////////////////////////////////////////////////////////////////
		out.print("<br>");
ServletContext context=getServletContext();		
		String cname=context.getInitParameter("cp");
		out.print(" this is Context param ");

		out.print("Welcome to "+cname);
		
		
		
		
		
		
		
		
	}
	
	

}
