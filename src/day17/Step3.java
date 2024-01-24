package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Step3 {//cs
    /*
        0. Class.forName("JDBC드라이버 클래스경로")
            -해당 클래스를 찾아서 JDBC드라이버 객체(DriverManager) 등록
        1. [클래스]DriverManager
            -연동 성공하면 Connection 구현체 반환
                -연동함수
                 DriverManager.getConnection("jdbc:mysql://ip번호:port번호/db명","계정명","비밀번호")
                 -ip번호 = localhost : 현재 pc
                 -port번호 = mysql 3306 사용 권장
        2.[인터페이스]Connection
            -statement , PreparedStatement 구현 객체를 반환한다.
            1. connection.prepareStatement(sql);        sql 서명/기재 된 PreparedStatement구현체를 반환한다.
        3.[인터페이스]PreparedStatement
            -DDL, DML 문을 실행 할 때 사용한다.
            -1. 실행
                1. insert , update , delete => .executeUpdate();
                2. select =>.excuteQuery();
        4.[인터페이스]ResultSet
            -DB에서 가져온 데이터를 읽을때 사용한다.
            1.다음 레코드 이동
                .next()     : 다음레코드 이동 후 존재하면 true / 없으면 false 반환
            2.현재 레코드에서 필드 값 호출 : .get타입(호출할 필드순서번호 or 필드명);
                                        .getString() : 문자타입 호출  , .getInt() : 정수타입 호출
    */
    public static void main(String[] args) {//ms
        //입력객체
        Scanner scanner = new Scanner(System.in);
        //DB연동
        Connection connection = null; //connection 을 사용하기 위해 전역에서 선언
        try {
            //1.JDBC 드라이버 로딩
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.DB서버와 연동 후 연동 객체 반환 받기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
            //3.DB연동시 필요한 메소드 중에 Class.forName, getConnection이 예외가 발생할 수 있다.
            //그러므로 try catch 구문으로 예외처리를 한다.
            System.out.println("<연동성공>");
        }catch (Exception e){
            System.out.println("<연동실패> : " +e);
        }


        while(true){ // w s
            System.out.print("고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            System.out.print("선택 > ");
            try {

                int ch = scanner.nextInt(); //만일 int타입 범위 벗어난 입력시 오류 발생 ----> try{}catch(){}로 예외처리
                scanner.nextLine();

                if(ch==1){
                    //1.입력받기
                    System.out.println("저장 고객명 : ");
                    String name = scanner.nextLine();
                    //2.DB 저장하기
                    //connection.prepareStatement("insert into members values('유재석')").executeUpdate();
                    //connection.prepareStatement("insert into members values("+name+")").executeUpdate();
                    //String sql ="insert into members values('입력받은값')";
                    String sql = "insert into members values('"+name+"')";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();

                }else if(ch==2){
                    //조건 없이 모든 출력, 입력받기X
                    //찾을때는 .executeQuery(); 를 사용 한다. 이때 반환을 저장 해야 하므로 (ResultSet resultSet) 필수 사용!!!!
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
                        System.out.println(resultSet); //select 결과물을 가지고 있는 인터페이스
                    //.next() : select 결과 테이블에서 다음 레코드로 이동후 존재여부 true/false 반환 함수
                    while(resultSet.next()){// 검색결과내 첫번째 레코드 부터 마지막 레코드 까지 순회
                        //하나씩 next를 이용해 레코드를 이동하면서 반복처리 이때 다음 레코드가 존재하면 true 이므로 계속 실행
                        //다음 레코드가 존재 하지 않으면 false 이므로 while 종료
                       /*
                       System.out.println(resultSet.getString(1)); 필드 가져올 순서번호
                       System.out.println(resultSet.getString("name")); 가져올 필드명
                       둘중 하나 사용
                       .get타입(호출필드번호 or 필드명)
                        */
                        System.out.println(resultSet.getString("name"));
                    }


                }else if(ch==3){
                    System.out.print("수정할 고객명 : ");
                    String oldname= scanner.nextLine();
                    System.out.print("새로운 고객명 : ");
                    String newname= scanner.nextLine();

                    //String sql = "update members set name = '새로운값' where name = '기존값' ";
                    String sql = "update members set name = '"+newname+"' where name = '"+oldname+"' ";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }else if(ch==4){
                    System.out.print("삭제할 고객명 : ");
                    String deletename = scanner.nextLine();

                    //String sql = "delete from members where name = '삭제할고객명' ";
                    String sql = "delete from members where name = '"+deletename+"' ";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }


            }catch (InputMismatchException e){
                System.out.println("<시스탬오류 : 정상적인 입력값이 아닙니다.>");
                scanner = new Scanner(System.in); // 기존에 입력받은 바이트를 지우기
            }catch (SQLException e){
                System.out.println("<시스템오류 : SQL 구문 오류>" +e);



            }



        }//w e



    }//me
}//cs
