package day18.model.dao;

import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
    //1. 필드
    //DB 연동 관련 인터페이스 준비물
        //여러 메소드에서 사용하려고 필드에서 생성
    private Connection conn; //DB 연동객체, PreparedStatement객체 생성
    private PreparedStatement ps; // 작성된 SQL을 가지고 있고, 실행 담당...
    private ResultSet rs; //SQL 실행 결과

    //싱글톤
    private MemberDao(){// 생성자 : 객체 생성시 초기화 담당
        // - 객체 생성시 db연동
        try {
            // 1.MYSQL 회사의 JDBC관련된 객체를 JVM에 로딩한다. 불러오기...
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.연동된 결과의 (구현체)객체를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "1234");
            System.out.println("<연동성공>");
        }catch (Exception e){
            System.out.println("<연동실패>"+e);
        }
    }
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    //1.회원가입
    public int signup(MemberDto memberDto){
        try {
            //1.SQL 작성 [변수가 들어갈 자리에는 물음표로 대체 가능하다.]]
            String sql = "insert into member(mid, mpw , mphone) values(?,?,?)";
            //2.SQL 기재
            ps = conn.prepareStatement(sql);
            //? 매개변수 대입
            ps.setString(1, memberDto.getMid()); //기재된 SQL내 첫번째 ?에 값을 대입한다.
            ps.setString(2, memberDto.getMpw());
            ps.setString(3, memberDto.getMphone());
            //3.SQL 실행      //4.SQL 결과
            int count = ps.executeUpdate(); //기재된 SQL 실행하고 insert된 레코드 개수 반환.
            if (count == 1) {return 0;} // 만약에 insert 처리된 레코드가 1개이면 회원가입 성공
        }catch (Exception e){
            System.out.println(e);
        }
        //5.함수종료

        return 1; //실패
    }

    //id 중복검사
    public boolean idCheck(String mid){
        try {
            //1.sql 작성
            String sql = "select mid from member where mid = ?";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //+ ? 매개변수 대입
            ps.setString(1, mid); //sql 문법 내 첫번째 ? 에 mid값 대입.
            //3.sql 실행
            rs = ps.executeQuery(); //결과물 반환이므로 쿼리 사용
            //4.sql 결과처리
            if (rs.next()) { //rs.next() : 검색 결과 테이블에서 다음 레코드 이동
                return true;
            }
        }catch (Exception e){
            System.out.println("오류발생 : "+e);
        }
        //5.함수종료
        return false; // 중복없음
    }

    //로그인
    public boolean login(MemberDto memberDto){
        try {
            //1.sql 작성
            String sql ="select mno from member where mid = ? and mpw = ?" ;
            //2.sql 기재
            ps=conn.prepareStatement(sql);
                //? 에 매개변수 대입
                ps.setString(1, memberDto.getMid()); // 첫번째 ? 에 memberDto.getMid() 대입
                ps.setString(2, memberDto.getMpw()); // 두번째 ? 에 memberDto.getMid() 대입
            //3.sql 실행
            rs = ps.executeQuery();
            //4.sql 결과처리
            if(rs.next()){
                return true;
            }

        }catch (Exception e){
            System.out.println("오류발생 : "+e);
        }

    return false;
    }



    public int findMno(String mid){
        try {
            String sql = "select mno from member where mid = ?";
            ps = conn.prepareStatement(sql);
                ps.setString(1,mid);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt("mno");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        return 0;
    }


}//ce
