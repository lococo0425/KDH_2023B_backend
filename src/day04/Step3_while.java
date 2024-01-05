package day04;

import java.util.Scanner;

public class Step3_while { // c s
    public static void main(String[] args) { // m s

        //p.129 while 문
        //while(조건식){ 실행문; }
        int k=1;
        while (k<=10){
            System.out.print(k+" ");
            k++;  // k를 1씩 증가!!!!

        }
        System.out.println("\n");

        int sum = 0;
        int m=1;
        while(m<=100){
            sum += m;
            m++;
        }
        System.out.println("1~"+(m-1)+"합 : " +sum);
        //while문 예제
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run){
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1")){
                speed++;
                System.out.println("현재속도 = "+speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재속도 = "+speed);
            } else if (strNum.equals("3")) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");





    } // m e
}// c e
