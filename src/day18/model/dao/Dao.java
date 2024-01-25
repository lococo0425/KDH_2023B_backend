package day18.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    protected Connection conn;
    protected PreparedStatement ps;
    protected ResultSet rs;

    protected Dao(){
        try{
            // 1.MYSQL 회사의 JDBC관련된 객체를 JVM에 로딩한다. 불러오기...
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.연동된 결과의 (구현체)객체를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");
            System.out.println("<연동성공>");
        }catch (Exception e){
            System.out.println("<연동실패>"+e);
        }

    }



}
