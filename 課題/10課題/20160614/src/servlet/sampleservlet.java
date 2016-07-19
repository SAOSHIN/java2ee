package servlet;


import java.io.IOException;

import javax.servlet.ServletContext;
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
		// TODO Auto-generated method stub
		Human human = new Human("ñ©Å@óYï„");
		
		ServletContext application = this.getServletContext();
		
		application.setAttribute("human", human);
		
		Human h = (Human) application.getAttribute("Human");
		
		application.removeAttribute("Human");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

//	public class SiteEV{
//		private int like;
//		private int dislike;
//	
//	
//		public siteEV(){
//			like = 0;
//			dislike = 0;
//		}
//		
//		public int getLike() {return like;}
//		public void setLike(int like){
//			this.like = like;
//		}
//		public int getDislike() {return dislike;}
//		public void setDislike(int dislike){
//			this.dislike = dislike;
//		}		
//	}
	
//	public class SiteEVLogic{
//		public void like(SiteEV site){
//			int count = site.getLike();
//			site.setLike(count + 1);
//		}
//		public void dislike(SiteEV site){
//			int count = site.getDislike();
//			site.setDislike(count + 1);
//		}
//	}
}
