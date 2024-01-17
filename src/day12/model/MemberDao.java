package day12.model;


import java.util.ArrayList;
import java.util.Random;


//DAO : 데이터베이스 접근 객체
public class MemberDao {
    //싱글톤
    private MemberDao(){}
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){
        return memberDao;
    }

    //DB 대신에 배열로 사용
    ArrayList<MemberDto>memberDtos=new ArrayList<>();
    //MemberDto[]  memberDtos = new MemberDto[100];

    //1.회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("3. MemberDao.signup");
        for(int i=0;i<memberDtos.size();i++) {
            if (memberDtos.get(i).getId().equals(memberDto.getId())){
                System.out.println("중복된 아이디 입니다.");
                return false;
            }
        }
        memberDtos.add(memberDto);

        return true; //회원가입 성공
    }


    //2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("3.MemberDao.login");

        //로그인 처리 : 전체 회원객체중에 입력받은 동일한 값이 있는지 확인
        for(int i =0; i< memberDtos.size();i++){
            //i는 0 부터 리스트내 요소 개수 까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                //리스트 내 i 번째 객체의 아이디와 입력받은 아이디(매개변수) 와 같으면
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    return true;
                }
            }
        }return false;

    }

    public String searchId(MemberDto memberDto){//아이디 찾기
        for(int i=0; i<memberDtos.size();i++){
            if(memberDtos.get(i).getName().equals(memberDto.getName())){
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return memberDtos.get(i).getId();
                }
            }
        }
        return null;

    }


    public String searchPw(MemberDto memberDto){//비밀번호 찾기
        for(int i=0; i<memberDtos.size();i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){

                    //memberDtos.get(i).setPw();

                }
            }
        }
        return null;
    }
}

