package 과제.과제1.과제7;

import day12.controller.MemberController;

import java.util.Scanner;

public class MemberView {

    //싱글톤
    private MemberView(){}
    private static MemberView memberView = new MemberView();
    public static MemberView getInstance(){
        return memberView;
    }


    public void signup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("아이디 : "); String id = scanner.nextLine();
        System.out.println("비밀번호 : "); String pw = scanner.nextLine();
        System.out.println("이름 : "); String name = scanner.nextLine();
        System.out.println("전화번호 : "); String phone = scanner.nextLine();
        System.out.println("나이 : "); String age = scanner.nextLine();

        MemberDto memberDto = new MemberDto(id,pw,name,phone,age);

        boolean result = Controller.getInstance().signup(memberDto);
        if(result){
            System.out.println("회원가입 성공");
        }else {
            System.out.println("회원가입 실패");
        }

    }

    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디 : "); String id = scanner.nextLine();
        System.out.print("비밀번호 : "); String pw = scanner.nextLine();

        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPw(pw);

        boolean result = Controller.getInstance().login(memberDto);
        if(result){
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }
    }

    public void searchID(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름 : "); String name = scanner.nextLine();
        System.out.print("전화번호 : "); String phone = scanner.nextLine();

        MemberDto memberDto = new MemberDto();
        memberDto.setName(name); memberDto.setPhone(phone);

        String result = Controller.getInstance().searchId(memberDto);
        if(result != null){
            System.out.println(result);
        }else {
            System.out.println("입력 값 없음");
        }
    }

    public void searchPw(){
        Scanner scanner =new Scanner(System.in);
        System.out.print("아이디를 입력하세요 : ");  String id = scanner.nextLine();
        System.out.print("전화번호를 입력하세요 :");  String phone = scanner.nextLine();


        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPhone(phone);

        String result = Controller.getInstance().searchPw(memberDto);

        if(result!=null){
            System.out.println(result);
        }
    }



}

