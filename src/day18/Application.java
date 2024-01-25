package day18;

import day18.view.MainView;

public class Application {
    public static void main(String[] args) {
        //1.인스턴스 메소드
//        MainView mainView = new MainView();
//        mainView.run();

        //2.인스턴스메소드
//        new MainView().run();

        //싱클톤
        MainView.getInstance().run();

        //정적메소드
        //메소드가 static이면
//        MainView.run();
    }
}
/*
    회원가입 MVC 패턴 설계
        1.회원가입에 들어갈 정보 [DB 테이블 설계]
            회원 번호
            회원 아이디
            회원 비밀번호
            회원 전화번호
            회원 가입날짜

        2.DTO설계
            회원 번호
            회원 아이디
            회원 비밀번호
            회원 전화번호
            회원 가입날짜
            +DB없는 필드 추가 가능.

        3.메소드 설계[MVC] 매개변수 / 리턴
        View                                   CONTROLLER                                 MODEL

        void signup(){}                       void signup(){}                         void signup(){}
                     ----------DTO--------->                   ----------DTO--------->
                     아이디 비밀번호 전화번호                      유효성검사가 통과된 DTO
                    <--------boolean-------                    <--------int-----------
                    true:성공 false:실패                         0: 성공 , 1: DB오류
                    <--------boolean-------
                    0:성공,1,아이디중복 등등



 */