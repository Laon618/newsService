package net.newsService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.newsService.nw.webNews;
import net.newsService.rv.webReview;

public class DAO {
	String host;
	String user;
	String pw;
	Connection conn;
	PreparedStatement pstmt;
	
	
	 public DAO() throws ClassNotFoundException, SQLException{
		 Class.forName("com.mysql.jdbc.Driver");
			this.host="jdbc:mysql://192.168.56.102/NewsDB";
			this.user="seon";
			this.pw="hafs2534";
			
			this.conn= DriverManager.getConnection(host,user,pw);
			
	 }
	 
	 public void insertReview(String name, String body) throws SQLException{
		 String insert ="INSERT INTO reviews VALUES(?,?,?,?)";
		 pstmt=conn.prepareStatement(insert);
		 pstmt.setInt(1, 7);
		 pstmt.setString(2, name);
		 pstmt.setString(3, body);
		 pstmt.setInt(4, 1);
		 pstmt.execute();
	 }
	 
	 public List getReviews(int nid) throws SQLException{
		 String select="SELECT * FROM reviews WHERE news_nid=?";
		 pstmt= conn.prepareStatement(select);
		 pstmt.setInt(1, nid);
		 ResultSet rs=pstmt.executeQuery();
		 List<webReview> reviews = new ArrayList<webReview>();
		while(rs.next()){
			webReview review = new webReview(rs.getString("name"), rs.getString("body"));
			reviews.add(review);
		}
		return reviews;
	 }
	 
	 public webNews getNews(int nid) throws SQLException{
		 String select="SELECT * FROM news WHERE nid=?";
		 pstmt= conn.prepareStatement(select);
		 pstmt.setInt(1, nid);
		 ResultSet rs=pstmt.executeQuery();
		 rs.next();
		webNews news = new webNews(rs.getInt(1), rs.getString("title"), rs.getString("author"), rs.getString("body"), rs.getString("uDate"));
		return news;
	 }

}
