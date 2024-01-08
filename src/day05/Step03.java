// Step01 을 배열로 바꾸기

package day05;

import java.util.Scanner;

public class Step03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호 = new int[3];

        while(true){
            System.out.println("============== 방문록 ===============");
            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료");
            System.out.printf("%2d \t %5s \t %20s \n",1, 작성자배열[0], 내용배열[0]);
            System.out.printf("%2d \t %5s \t %20s \n",2, 작성자배열[1], 내용배열[1]);
            System.out.printf("%2d \t %5s \t %20s \n",3, 작성자배열[2], 내용배열[2]);
            System.out.println();

            System.out.println("선택 > ");
            int ch =scanner.nextInt();

            if(ch ==1 ){
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt();
                scanner.nextLine();
                System.out.println("내용 : "); String content = scanner.nextLine();
                System.out.println("작성자 : "); String writer = scanner.nextLine();
                System.out.println("비밀번호 : "); int password = scanner.nextInt();

                //작성 내용 저장
                내용배열[no-1] = content;
                작성자배열[no-1] = writer;
                비밀번호[no-1] = password;

            }
            else if(ch==2){
                System.out.println("방문록 삭제 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt();
                System.out.println("비밀번호를 입력하세요!");
                int password = scanner.nextInt();
                if(비밀번호[no-1] == password) {
                    내용배열[no - 1] = null;
                    작성자배열[no - 1] = null;
                    비밀번호[no - 1] = 0;
                }else{
                    System.out.println("[경고] 잘못된 비밀번호 입니다.");
                }
            }
            else if(ch==3){
                System.out.println("프로그램을 종료 합니다."); break;}
            else {
                System.out.println("[경고] 알수 없는 입력입니다.");
            }
        }
    }
}
