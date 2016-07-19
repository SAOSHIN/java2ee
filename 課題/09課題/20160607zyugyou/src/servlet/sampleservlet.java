package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sampleservlet
 */
@WebServlet("/sampleservlet")
public class sampleservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sampleservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException 
	{
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/forward.jsp");
		dispatcher.forward(request, response);
		// TODO Auto-generated method stub
		response.setContentType("text/plan; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<hello world>");
		out.println("</html>");
		out.print("<?xml version='1.0' ?>"
	                + "<book>"
	                + "<author>ïΩç‚ì« </author>"
	                + "<title>ñlÇÕóFíBÇ™è≠Ç»Ç¢ (11) (MFï∂å…J) ÉpÉì</title>"
	                + "<date>2015/8/26</date>"
	                + "</book>");
		
		response.sendRedirect("http://localhost:8080/example/SampleServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
