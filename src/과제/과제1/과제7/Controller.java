package 과제.과제1.과제7;

public class Controller {
    private Controller(){}
    private static Controller controller = new Controller();
    public static Controller getInstance(){return controller;}

    public boolean signup(MemberDto memberDto){
        boolean result = MemberDao.getInstance().signup(memberDto);

        return result;
    }



    public boolean login(MemberDto memberDto){
        boolean result = MemberDao.getInstance().login(memberDto);

        return result;
    }


    public String searchId(MemberDto memberDto){
        String result = MemberDao.getInstance().searchId(memberDto);
        return result;
    }

    public String searchPw(MemberDto memberDto){
        String result = MemberDao.getInstance().searchPw(memberDto);
        return result;
    }

}
