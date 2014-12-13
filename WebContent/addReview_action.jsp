<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="net.newsService.rv.webReview" %>
<%@ page import="net.newsService.db.Database" %>
<%
	String name = request.getParameter("name");
	String body = request.getParameter("body");
	
	
	webReview review = new webReview(name, body);
	Database.addReview(review);
	
	response.sendRedirect("/showNews.jsp");
%>