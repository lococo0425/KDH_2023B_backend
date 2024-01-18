package 팀과제.팀과제1.조별과제3.view;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("========================");
            System.out.println("1.계좌생성 | 2.예금 | 3.출금");
            System.out.println("=========================");
            System.out.print("선택 > ");
            String ch = scanner.nextLine();
            if(ch.equals("1")){

            }else if(ch.equals("2")){

            }else if(ch.equals("3")){

            }
            else {
                System.out.println("잘못된 입력입니다.");
            }



        }
    }
}
