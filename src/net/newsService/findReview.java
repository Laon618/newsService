package net.newsService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/findReview")
public class findReview extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nid = req.getParameter("nid");
		if(nid==null){
			resp.sendRedirect("/");
			return;
		}
		
//		newsDAO newsDao = new newsDAO();
//		try{
//			reviews
//		}
//		
//		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
