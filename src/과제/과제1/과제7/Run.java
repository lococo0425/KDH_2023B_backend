package 과제.과제1.과제7;

import java.util.Scanner;

public class Run {
    private Run (){}
    private static Run run = new Run();
    public static Run getInstance(){return run;}


    Scanner scanner = new Scanner(System.in);

    public void main(){
        while(true){
            System.out.println("=========메인===========");
            System.out.println("1.회원가입 | 2.로그인 | 3.아이디 찾기 | 4.비밀번호 찾기 ");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if(ch==1){
                MemberView.getInstance().signup();
            }else if(ch==2){
                MemberView.getInstance().login();
            }else if(ch==3){
                MemberView.getInstance().searchID();
            }else if(ch==4){
                MemberView.getInstance().searchPw();
            }

        }
    }
}
