package net.newsService;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


@WebServlet("/addNews")
public class addNews extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		StringBuffer jb = new StringBuffer();
		String line = null;
		try {
		  BufferedReader reader = req.getReader();
		   while ((line = reader.readLine()) != null)
		     jb.append(line);
		 } catch (Exception e) { /*report an error*/ }

		JsonParser parser = new JsonParser();
		JsonObject jsonObj = (JsonObject) parser.parse(jb.toString());
		
		String title = jsonObj.get("title").getAsString();
		String body = jsonObj.get("body").getAsString();
		String author = jsonObj.get("author").getAsString();
		String uDate = jsonObj.get("uDate").getAsString();
		

		
		try {
			DAO dao= new DAO();
			dao.insertNews(title,body,author,uDate);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
