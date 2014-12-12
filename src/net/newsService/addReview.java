package net.newsService;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class addReview extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.getWriter().print("Hello World from servlet");
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String body = req.getParameter("body");
		String name = req.getParameter("name");
		//request객체에 있는 interface. 
		
//		response.setContentType("text/html");
//		//response객체에 interface로 있는 함수를 쓴거에요.
//		PrintWriter out= response.getWriter();
//		out.println("Beer Selection Advice<br>");
//		out.println("<br>Got beer color " + c);
		//얘는 결과를 보여주는게 아니라 입력받은 색의 값을 보여주는 거에요!
		
		System.out.println(body);
//		while(it.hasNext()){
//			out.println("<br>try: "+ it.next());
		resp.getWriter().print(body+ " "+ name);
	}
}
