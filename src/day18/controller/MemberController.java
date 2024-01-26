package day18.controller;

import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;
import day18.view.MemberView;

public class MemberController {

    private MemberController(){};
    private static MemberController memberController = new MemberController();
    public static MemberController getInstance(){return memberController;}

    //1. 회원가입
    public int signup(MemberDto memberDto){
        // 1. 반환 변수
        int result = 0;


            //3.로직 가공 처리

                //1. 만일 입력받은 아이디의 길이가 8글자 미만이면 실패
//        if(memberDto.getMid().length()<8){
//            return 3;
//
//        }
//                //2. 아이디 중복검사
//
            if(MemberDao.getInstance().idCheck(memberDto.getMid())){
                return 2;
        }
//                //3.회원가입 요청
            result = MemberDao.getInstance().signup(memberDto);

        //2.반환
        return result;
    }

    //- 로그인 상태 필드
        int loginMno =0;

    //2.로그인

    public boolean login(MemberDto memberDto){
        boolean result = false;
        result = MemberDao.getInstance().login(memberDto);
        if(result){
            loginMno = MemberDao.getInstance().findMno(memberDto.getMid());
        }


        return result;
    }
    //2-2 로그아웃
    public void logout(){
        loginMno=0;
    }



    //로그인Mno 가져오는 메소드생성
    public int getLoginMno() {
        return loginMno;
    }

}//ce
