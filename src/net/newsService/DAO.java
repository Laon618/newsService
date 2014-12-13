package net.newsService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
