package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDao;
import day12.model.MemberDto;

import java.util.Scanner;

// VIEW : 화면구현(입출력)
public class MemberView {

    //싱글톤
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){
        return memberView;
    }


        //1.회원가입 메소드
    public void signup() {
        System.out.println("1.MemberView.signup");
        Scanner scanner = MainView.getInstance().scanner;
        //1.입력받기
        System.out.println("아이디 : ");     String id = scanner.nextLine();
        System.out.println("비밀번호 : ");   String pw = scanner.nextLine();
        System.out.println("이름 : ");      String name = scanner.nextLine();
        System.out.println("전화번호 : ");   String phone = scanner.nextLine();
        //2.객체화
        MemberDto memberDto = new MemberDto(0,id,pw,name,phone);

        boolean result = MemberController.getInstance().signup(memberDto);
        System.out.println("5.result = " + result);

        //3. 객체를 컨트롤에게 전달(매개변수 (필요한 정보,객체 전달)) 후
        // 처리 결과(return (처리결과))를 받기
        //4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내] 회원가입 성공 ");
        }else {
            System.out.println("안내] 회원가입 실패 ");
        }

    }

    //2. 로그인 메소드
    public void login(){
        System.out.println("1.MemberView.login");
        //1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("아이디 : ");         String id = scanner.nextLine();
        System.out.print("비밀번호 : ");       String pw = scanner.nextLine();

        //2. 객체 vs 문자열 나열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPw(pw);

        //3. 컨트롤에게 전달 하고 결과 받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("5.result = " + result);
        if(result) {
            System.out.println("로그인 성공");
        }else {
            System.out.println("로그인 실패");
        }

    }

    public void searchId(){
        Scanner scanner = MainView.getInstance().scanner;
        //1. 입력받기
        System.out.print("이름을 입력하세요 : "); String name = scanner.nextLine();
        System.out.print("전화번호를 입력하세요 : "); String phone = scanner.nextLine();
        //2. 객체
        MemberDto memberDto = new MemberDto();
        memberDto.setName(name); memberDto.setPhone(phone);

        //3. 컨트롤에 전달
        String result = MemberController.getInstance().searchId(memberDto);
        if(result != null ){
            System.out.println( result );
        }else{
            System.out.println("입력된 정보가 없습니다.");
        }
    }

    public void searchPw(){
        Scanner scanner = MainView.getInstance().scanner;
        //입력
        System.out.print("아이디를 입력하세요 : ");  String id = scanner.nextLine();
        System.out.print("전화번호를 입력하세요 :");  String phone = scanner.nextLine();

        //객체
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);    memberDto.setPhone(phone);

        //컨트롤에 전달
        String result = MemberController.getInstance().searchPw(memberDto);

    }
}
