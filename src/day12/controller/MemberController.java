package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

//CONTROLLER : VIEW 와 DAO 중계 역활
public class MemberController {

    //싱글톤
    private MemberController(){}

    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){
        return memberController;
    }


    //1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("2.MemberController.signup");
        //1.유효성 검사 처리
        //2.view 받은 객체를 DAO에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        System.out.println("4. result = " + result);
        //컨트롤 처리
        return result;
    }

        //+로그인 했다는 증거 남기기 -로그아웃 하기전까지 유지 [회원번호, 아이디를 활용]

            //로그인 상태 필드
        String loginSession = null; // null이면 비로그인 아이디가 있으면 로그인 상태

    //로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("2.MemberController.login");
       boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("4.result = " + result);
        if(result){
            //로그인 상태 필드에 로그인 성공한 아이디를 대입한다.
            loginSession = memberDto.getId();
        }
        return result;
    }

    public String searchId(MemberDto memberDto){ //아이디 찾기
        String result = MemberDao.getInstance().searchId(memberDto);
        return result;
    }

    public String searchPw(MemberDto memberDto){//비밀번호 찾기
        String result = MemberDao.getInstance().searchPw(memberDto);
        return null;
    }
}
