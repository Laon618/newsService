package net.newsService;

import java.sql.*;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String host="jdbc:mysql://192.168.56.102/NewsDB";
		String user="seon";
		String pw="hafs2534";
		
		Connection conn= DriverManager.getConnection(host,user,pw);
		//실제 DB에 접속할 때 씁니다. 
		//conn으로부터 stmt를 받아옵니다. 
		Statement stmt=conn.createStatement();
		//stmt는 다시 sql을 실행하게 되죠.
		PreparedStatement pstmt;
		
		
		//String insert ="INSERT INTO news VALUES(7, 'newsTitle7', 'author7', 'article7', '2011-12-01')";
		String insert ="INSERT INTO news VALUES(?,?,?,?,?)";
		pstmt=conn.prepareStatement(insert);
		String sql ="SELECT * FROM news";
		String update = "UPDATE news SET title= 'newTitles!' WHERE nid=1 ";
		String delete = "DELETE FROM news WHERE nid=7";
		
		//insert
//		stmt.execute(insert);
		
//		pstmt.setInt(1, 7);
//		pstmt.setString(2, "newTitle7");
//		pstmt.setString(3, "newTitle8");
//		pstmt.setString(4, "newTitle9");
//		pstmt.setString(5, "2011-12-02");
//		
//		pstmt.execute();
		
		
		//delete
		stmt.execute(delete);
		
		
		//update
//		int m = stmt.executeUpdate(update);
//		System.out.println(m);
		//return값 = update의 영향을 받은 record의 갯수. 
		
		
		ResultSet rs = stmt.executeQuery(sql);//select
		//rs는 처음에 header를 가리킨다! 
		//그래서 rs.next()를 한번 하고 난 후에야 첫번째 값을 가리키게 되는 것! 
		while(rs.next()){
			int n = rs.getInt(1);
			String title = rs.getString("title");
			String author = rs.getString("author");
			String body = rs.getString("body");
			String date = rs.getString("uDate");
			System.out.println(n +" " +title+" " + author+" " + body+" " + date);

		}
		
		System.out.println("OK");
		
		
		
		stmt.close();
		conn.close();
	}

}
