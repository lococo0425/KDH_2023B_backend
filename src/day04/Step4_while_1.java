package day04;

import java.util.Scanner;

public class Step4_while_1 { // c s
    public static void main(String[] args) { // m s
        /*
            은행 프로그램 구현하기
            1. 반복적으로 기능 사용 [단 * 종료 기능 선택시 종료]
            2. 기능 : 예금, 출금 ,잔고, 종료
                예금 : 더하기
                    금액에서 예금액을 입력받아 금액에 더함
                출금 : 빼기
                    금액에서 출금액을 입력받아 금액에 뺌
                잔고 : 확인
                    금액의 값을 출력한다.
                종료 : 프로그램 끝내기
                    무한루프 종료
        */



        Scanner scanner = new Scanner(System.in);
        int strNum;
        int money =0;
        while (true){
            System.out.println("------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택 : ");
            strNum = scanner.nextInt();

            if(strNum==1){
                System.out.print("예금액 : ");
                int inMoney = scanner.nextInt();
                money += inMoney;
            }
            if (strNum==2) {
                System.out.print("출금액 : ");
                int outMoney = scanner.nextInt();
                if(money<outMoney) {
                    System.out.println("금액이 부족합니다.");
                }else {
                    money -= outMoney;
                }
            }
            if (strNum==3){
                System.out.println("잔고 : "+money);
            }
            if (strNum==4){
                System.out.println("프로그램 종료");
                break;
            }

        }



    }// m e
}// c e
