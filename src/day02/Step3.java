package day02;

import java.util.Scanner;

public class Step3 { //c s
    public static void main(String[] args) { //m s

        /*p.70 콘솔에서 키보드로 부터 입력 받고 변수에 저장하기

            [준비물]
            1. Scanner 클래스 : 입력에 관련된 메소드 /속성 제공 하는 설계도
            2. Scanner 클래스 이용한 객체 생성
                 Scanner scanner = new Scanner(System.in)
                 클래스명   변수명   new 클래스명(매개변수)
                     System.in : 시스템 입력 = 키보드
                     System.out : 시스템 출력 = 모니터(콘솔)

            3. 객체/변수 이용한 입력 값 호출 메소드
                 객체/변수명.nextLine() :  엔터 키가 입력 되면 지금 까지 입력된 모든 내용을 읽는다.
        */

        Scanner scanner = new Scanner(System.in);
//        System.out.println("x 값 입력");
//
//        String strX = scanner.nextLine();
//        int x = Integer.parseInt(strX);
//
//
//        System.out.println("y 값 입력");
//        String strY = scanner.nextLine();
//        int y = Integer.parseInt(strY);
//
//        int result = x+y;
//        System.out.println("x+y 값 : " + result);
//        System.out.println("result = " + result);

        // [ Scanner 가 제공하는 메소드 ]
        //1. 입력 받은 문자열(String) 반환.      띄어쓰기 반환 불가
        String str1 = scanner.next();        System.out.println("srt1 = " + str1);
        scanner.nextLine();

        //2. 입력받은 문자열(String) 반환        띄어쓰기 반환 [주의할점 : 앞에 next()가 있을 경우 하나로 취급....]
        String str2 = scanner.nextLine();        System.out.println("str2 = " + str2);
        
        //3. 입력받은 논리(Boolean) 반환
        boolean bool = scanner.nextBoolean();        System.out.println("bool = " + bool);
        
        //4. 입력받은 byte 반환
        byte b = scanner.nextByte();        System.out.println("b = " + b);
        
        //5. 입력받은 short 반환
        short s = scanner.nextShort();        System.out.println("s = " + s);
        
        //6. 입력받은 int 반환
        int i = scanner.nextInt();        System.out.println("i = " + i);
        
        //7. 입력받은 long 반환
        long l = scanner.nextLong();        System.out.println("l = " + l);
        
        //8. 입력받은 float 반환
        float f = scanner.nextFloat();        System.out.println("f = " + f);
        
        //9.입력받은 double 반환
        double d = scanner.nextDouble();        System.out.println("d = " + d);

        //10. 문자반환은 없음.... 그래서 ---> "문자열".charAt(추출 인덱스)
        char ch = scanner.next().charAt(0); //첫글자 추출        System.out.println("ch = " + ch);

        //** 기본 타입 비교시 ==
        //                  vs 참조타입(문자열) 비교시 "문자열".equals("비교할문자열");
    }// m e
}//c e
