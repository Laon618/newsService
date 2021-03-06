package net.newsService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@WebServlet("/addReview")
public class addReview extends HttpServlet{

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
		
		String body = jsonObj.get("body").getAsString();
		String name = jsonObj.get("name").getAsString();
		int nid = jsonObj.get("nid").getAsInt();

		PrintWriter out = resp.getWriter();
		
		try {
			DAO dao= new DAO();
			dao.insertReview(name,body,nid);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


			
	


		
		System.out.println(body);
//		while(it.hasNext()){
//			out.println("<br>try: "+ it.next());
		resp.getWriter().print(body+ " "+ name);
	}
}
