package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

	 //Khai báo driver làm việc với MySQL Server
   private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
   
   //Khai báo database cách làm việc
   private static final String DATABASE_LINK = "jdbc:mysql://localhost/estate_9_2020";
  
   
  public static Connection layKetNoi()
  {
      Connection conn = null;
       try {
          
           Class.forName(JDBC_DRIVER);
           
           conn = DriverManager.getConnection(DATABASE_LINK, "root", "a202jinhofm");
           
       } catch (ClassNotFoundException ex) {
           System.err.println("Không tìm thấy driver. Chi tiết: " + ex.getMessage());
       } catch (SQLException ex) {
           System.err.println("Lỗi không kết nối với MySQL. Chi tiết: " + ex.getMessage());
       }
      
       return conn;
  }
}
