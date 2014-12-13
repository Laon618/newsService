package net.newsService.rv;

import java.sql.SQLException;

import net.newsService.DAO;

public class webReview {
	public String name;
	public String body;
	public webReview(String name, String body) {
		super();
		this.name = name;
		this.body = body;
	}
	public String getName() {
		return name;
	}
	public String getBody() {
		return body;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "webReview [name=" + name + ", body=" + body + "]";
	}
	
	public void addToDb() throws ClassNotFoundException, SQLException{
		DAO dao = new DAO();
		dao.insertReview(name,body);
		System.out.println("ok");
	}
	
}
