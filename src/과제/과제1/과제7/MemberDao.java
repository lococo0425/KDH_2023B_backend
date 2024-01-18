package 과제.과제1.과제7;

import java.util.ArrayList;

public class MemberDao {

    private MemberDao(){}
    private static MemberDao memberDao =new MemberDao();

    public static MemberDao getInstance(){return memberDao;}

    ArrayList<MemberDto>memberDtos=new ArrayList<>();

    public boolean signup(MemberDto memberDto){
        for(int i=0; i<memberDtos.size();i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                System.out.println("중복된 아이디 입니다.");
                return false;
            }
        }
        memberDtos.add(memberDto);
        return true;
    }


    public boolean login(MemberDto memberDto){
        for(int i=0; i<memberDtos.size(); i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    return true;
                }
            }
        }return false;
    }

    public String searchId(MemberDto memberDto){
        for(int i=0; i<memberDtos.size();i++){
            if(memberDtos.get(i).getName().equals(memberDto.getName())){
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return memberDtos.get(i).getId();
                }
            }
        }
        return  null;
    }

    public String searchPw(MemberDto memberDto){
        for(int i=0; i<memberDtos.size();i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    return memberDtos.get(i).getPw();
                }
            }
        }
        return null;
    }

}
