package net.newsService.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import net.newsService.rv.webReview;



public class Database {
	private static Map<String, webReview> reviews = new HashMap<String, webReview>();
	
	public static void addReview(webReview review) throws ClassNotFoundException, SQLException{
		reviews.put(review.getName(), review);
		reviews.put(review.getBody(), review);
		review.addToDb();
		System.out.println("review : "+ review);
	}
	
}
