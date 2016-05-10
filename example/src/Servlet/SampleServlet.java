package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SampleServlet
 */
@WebServlet("/SampleServlet")
public class SampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//‰^¨‚ğƒ‰ƒ“ƒ_ƒ€‚ÅŒˆ‚ß‚é
		String[] luckArray = {"’´‚·‚Á‚«‚è","‚·‚Á‚«‚è","•’Ê","Åˆ«","’´Åˆ«"};
		//—”‚Å­ô
		int index = (int)(Math.random()*5);
		String luck = luckArray[index];
		//Às“ú
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String today = sdf.format(date);
		
		//o—Í
		response.setContentType("text/html; charset=UTF-8" );
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>‚·‚Á‚«‚èè‚¢</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + today + "‚Ì‰^¨‚Í" + luck + "‚Å‚·</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
