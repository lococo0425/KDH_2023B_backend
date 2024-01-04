package day03;

import java.util.Scanner;

public class Step2 { // c s
    public static void main(String[] args) { //m s

        // 예제1 : 작성자 , 내용 , 날짜 3가지를 문자로 입력받아 줄력
        Scanner scanner = new Scanner(System.in);

        System.out.print("작성자 : " );
        String writer = scanner.next();
        System.out.print("내용 : " );
        String contents = scanner.next();
        System.out.print("날짜 : " );
        String date = scanner.next();

        System.out.printf("=================방명록===================\n");
        System.out.printf("%4s %10s %20s %10s \n","번호","작성자","내용","날짜");
        System.out.printf("%4s %10s %20s %10s",1,writer,contents,date);

        //예제2 : 기본급과 수당 정수로 입력받아 실수령액 계산해서 출력
            // 실 수령액 : 기본급 + 수당 - 세금[기본급 10%]

        System.out.print("기본급 : ");
        int 기본급 = scanner.nextInt();
        System.out.print("수당 : ");
        int 수당 = scanner.nextInt();

        int 실수령액 = 기본급 + 수당 -(int)(기본급*0.1);

        System.out.printf("============실수령액 계산=============\n");
        System.out.printf("%10s %10s %10s\n","기본급","수당","실수령액");
        System.out.printf("%14s %12s %10s\n",기본급,수당,실수령액);

    } //m e
} // c e
