package day12.view;

import java.util.Scanner;

//화면구현 (입출력)
public class MainView { //cs
    /*
    싱글톤 : 프로그램 내 하나의 객체를 사용 패턴
    1.생성자 :  private
    2.필드에 본인 객체 생성 : private static
    3.객체를 외부로부터 전달하기 위한 함수 getInstance()
    */
    private MainView(){}
    private static MainView mainView = new MainView();
    public static MainView getInstance(){return  mainView;}

    //멤버
    //1.필드
    Scanner scanner = new Scanner(System.in);
        //필드와 지역 변수의 차이 : 지역변수는 스택에 저장되고 함수안에서 선언됌 , 함수밖에서 사용 불가
                                //필드는 함수 안에서도 사용 할 수있고 외부에서도 사용 할 수 있다/ 단, 인스턴스일때
    //2.생성자

    //3.메소드
    //public static void run(){
    public void run(){//ms
        while (true){//ws
            System.out.println("=========메인페이지=========");
            System.out.println("1.회원가입 | 2.로그인 | 3.아이디 찾기 | 4.비밀번호 찾기 ");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if (ch == 1) {//회원가입 페이지 이동
                MemberView.getInstance().signup();
            }else if(ch==2){//로그인 페이지 이동
                MemberView.getInstance().login();
            }else if(ch==3){//아이디 찾기
                MemberView.getInstance().searchId();
            }else if(ch==4){
                MemberView.getInstance().searchPw();
            }

        }//we
    }//me
}//ce
