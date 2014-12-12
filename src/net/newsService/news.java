package net.newsService;

import java.util.List;

public class news {
	int nid;
	String title;
	String author;
	String body;
	String uDate;
	List reviews ;
	
	
	public int getNid() {
		return nid;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getBody() {
		return body;
	}
	public String getuDate() {
		return uDate;
	}
	public List getReviews() {
		return reviews;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public void setuDate(String uDate) {
		this.uDate = uDate;
	}
	public void setReviews(List reviews) {
		this.reviews = reviews;
	}
	
	
}
