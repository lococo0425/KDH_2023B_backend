package day05;

import java.util.Scanner;

public class Step01 { //cs
    public static void main(String[] args) {//ms //메인함수 : 자바 코드 진입점 ( 스레드 포함 )
        Scanner scanner= new Scanner(System.in);
        boolean run= true;
        String 내용1="", 내용2="", 내용3="";
        String 작성자1 = "", 작성자2="", 작성자3="";
        int 비밀번호1=0; int 비밀번호2=0; int 비밀번호3=0;


        while(run) {
            System.out.println("================방문록===============");

            System.out.printf("%2d \t %5s \t %20s \n",1, 작성자1, 내용1);
            System.out.printf("%2d \t %5s \t %20s \n",2, 작성자2, 내용2);
            System.out.printf("%2d \t %5s \t %20s \n",3, 작성자3, 내용3);


            System.out.println("1.방문록 작성 | 2.방문록 삭제 | 3.종료");
            System.out.print("선택 : ");
            int num = scanner.nextInt();

            if(num==1) {
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");

                int no = scanner.nextInt();
                scanner.nextLine();
                System.out.println("내용 : ");                    String content = scanner.nextLine();
                System.out.println("작성자 : ");                    String writer = scanner.nextLine();
                System.out.println("비밀번호 : ");                    int password = scanner.nextInt();

                if (no == 1) {내용1 = content;        작성자1 = writer;      비밀번호1 = password;
                } else if (no == 2) {내용2 = content;    작성자2 = writer;   비밀번호2 = password;
                } else if (no == 3) {내용3 = content;    작성자3 = writer;   비밀번호3 = password;
                }
            } else if (num==2) {
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt();

                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();

                if (no == 1 && 비밀번호1 == password) {
                    내용1 = "";   작성자1 = "";    비밀번호1 = 0;
                } else if (no == 2 && 비밀번호2 == password) {
                    내용2 = "";   작성자2 = "";    비밀번호2 = 0;
                } else if (no == 3 && 비밀번호3 == password) {
                    내용3 = "";   작성자3 = "";    비밀번호3 = 0;
                } else if (no >= 1 && no <= 3) {
                    System.out.println("[경고] 패스워드가 다릅니다.");
                } else {
                    System.out.println("[경고] 알수없는 위치 입니다. ");
                }

            }else {
                System.out.println("프로그램을 종료 합니다.");
                run =false;
            }
        }
    }//me
}//ce


/*
    비회원제 방문록 프로그램[JAVA 만 사용 할것.]
        1. 방문록 작성 / 삭제 기능 구현
            1. 초기메뉴가 반복적으로 실행되어야 한다.
                - 단 특정 조건에 따라 종료한다.
            2. 초기 메뉴에 대해서 선택(입력) 받는다.


 */