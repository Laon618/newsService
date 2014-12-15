package net.newsService.nw;

import java.util.List;

import net.newsService.rv.webReview;

public class webNews {
	public int nid;
	public String title;
	public String author;
	public String body;
	public String uDate;
	public List<webReview> reviewList;
	
	public webNews(int nid, String title, String author, String body,
			String uDate) {
		super();
		this.nid = nid;
		this.title = title;
		this.author = author;
		this.body = body;
		this.uDate = uDate;
	}

	public List<webReview> getReviewList() {
		return reviewList;
	}

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
	
	public void setReviewList(List<webReview> reviewList) {
		this.reviewList = reviewList;
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
	
}
