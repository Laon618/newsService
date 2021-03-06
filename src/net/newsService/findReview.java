package net.newsService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.newsService.rv.webReview;

import com.google.gson.Gson;


@WebServlet("/findReview")
public class findReview extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newsId = req.getParameter("nid");
		PrintWriter out = resp.getWriter();
		if(newsId==null){
			resp.sendRedirect("/");
			return;
		}
		
		int nid = Integer.parseInt(newsId);
		out.println("nid " +nid);
		try {
			DAO dao = new DAO();
			List reviews = dao.getReviews(nid);
			if(reviews==null){
				return;
			}
			Gson gson = new Gson();
			String jsonData =gson.toJson(reviews);
			resp.setContentType("application/json;charset=UTF-8");
			out.print(jsonData);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
