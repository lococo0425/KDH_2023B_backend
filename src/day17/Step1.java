package day17;

import java.sql.Connection;
import java.sql.DriverManager;

public class Step1 {
    public static void main(String[] args) {
        //1. Class.forName() : 현재 프로젝트내 클래스를 찾고 메모리로 로딩한다.
        //MYSQL 회사 driver 클래스 찾기
        //해당 폴더내 driver 클래스를 찾는 과정에서 오류가 발생할수도 있다.
        //-ClassNotFoundException : 클래스를 찾지 못했다.

        try {//만약에 해당 클래스를 못찾았을때
            Class.forName("com.mysql.cj.jdbc.Driver");

        }catch (Exception e){
            System.out.println("[시스템오류] : JDBC 드라이버 클래스를 찾지 못했습니다."+e);
        }

            //2. Connection : db연동 인터페이스
            //인터페이스 타입으로 변수 선언

            //인터페이스는 스스로 객체를 만들 수 없다.
            //!!! : 구현체(구현객체 -> 구현클래스(implement)로 생성된 객체)필요
            //DriverManager.getConnection("DB서버주소/명","계정명","비밀번호")

        try { // 만약에 해당 연동할 db서버의 정보가 잘못되거나 db서버쪽에 문제가 발생했을때 대처...
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
            System.out.println("[시스템정보] DB서버와 연동 성공했습니다.");
        }catch (Exception e){
            System.out.println("[시스템오류] : MYSQL서버와 연동이 실패 했습니다." + e);
        }
    }
}

/*
    -예외/오류처리 : 1.일반예외 2.실행예외
        -예외/오류가 발생했을때 대처 하기위해.

            1.일반예외 : 컴파일시 예외가 체크 = 컴파일시 예외/오류 발생
                자바 외부와 통신하는 클래스들..(클래스 db서버 등등)
                -1.Scanner 클래스에 예외처리
                -2.DAO(Data Access Object) : 주로 DB 연동/조작 객체

            2.실행예외 : 실행중에 발생한 예외 체크 = 실행중에 예외/오류 발생
                1.NullPointerException


     -만약에 오류가 발생할것 같은 코드에 처리
     -문법
        try{

        }catch(예외클래스명 변수){

        }

 */