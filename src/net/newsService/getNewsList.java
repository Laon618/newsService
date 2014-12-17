package net.newsService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.newsService.nw.webNews;

import com.google.gson.Gson;

@WebServlet("/getNewsList")
public class getNewsList extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		try {
			DAO dao = new DAO();
			List newsList = dao.getNewsList();
			if(newsList==null){
				return;
			}
			
			
			Gson gson = new Gson();
			String jsonData =gson.toJson(newsList);
			
			
			resp.setContentType("application/json;charset=UTF-8");
			out.print(jsonData);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}
}
