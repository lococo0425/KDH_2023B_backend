package day02; //패키지명

import java.util.Arrays;

public class Step2 { //class s
    public static void main(String[] args) { //main s
        //p.63 더하기 vs 연결 연산자
        int result1=10+2+8;                 // 숫자의 경우 연산
        System.out.println(result1+"10");   // 문자열("10")일 경우에는 연결 // 20 10 => 2010

        //p.64 문자열을 기본타입으로 변환
            // - JAVA외 애플리케이션과 통신할때[메모장, HTTP, 네트워크 ]
            //HTTP로 부터 10을 받음 -> 문자? 숫자? --> 문자!!
            // - 문자열 -> 기본타입[기본타입클래스명.parse~~();]

        int value1 = Integer.parseInt("10"); // "10" -> 10
        double value2 = Double.parseDouble("3.14"); // "3.14" -> 3.14
        boolean value3 = Boolean.parseBoolean("true"); // "true" -> true

        //- 기본타입을 문자열 변환
        //1. String.valueOf(기본타입값)'
        String str1 = String.valueOf(10);
        //2. 기본 타입값에 의미없는 "" 문자열 리터럴 연결 하기
        String str2 = 10+"";

        //p.66 변수 사용 범위
            //- 선언된 변수는 해당 중괄호{}블록 내에서만 사용 가능하고 밖에서는 사용 할 수 없다.

        //p.67 콘솔로 변수값 출력
        //System.out.println();
            // System클래스 : 시스템 관련된 클래스 [ 다양한 메소드와 속성(필드) 제공]
                //out : 출력 vs in : 입력
                //System.out vs System.in
                    //1. println()                              : 콘솔 출력 후 줄바꿈
                    //2. print()                                : 콘솔 출력
                    //3. printf("형식1 형식2",값1, 값2)           : 콘솔 형식에 맞춰서 출력
        //1.print(리터럴 또는 변수명)
        System.out.print("출력문구1"); //출력
        System.out.print("출력문구2");
        //2.println(리터럴 또는 변수명)
        System.out.println("출력문구3"); //출력 후 줄바꿈 처리
        System.out.println("출력문구4");
        //3.printf()
            //%d : 정수 형식
                //%숫자d : 숫자만큼의 자릿수 차지, 만일 비어있는 자릿수는 공백 처리
        System.out.printf("%s \n", "출력문구5");

        int valueInt=123;
        System.out.printf("상품의 가격 %d 원\n",valueInt );
        System.out.printf("상품의 가격 %6d 원\n",valueInt );
        System.out.printf("상품의 가격 %-6d 원\n",valueInt );
        System.out.printf("상품의 가격 %06d 원\n",valueInt );

        double area = 3.14159 *10 *10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f", 10 ,area);

        String name = "홍길동"; String job = "도적";
        System.out.printf("%6d|%-10s|%10s \n",1,name,job);

        //인텔리제이에서 제공하는 자동완성
            //sout
                System.out.println();
            //souf
                System.out.printf("");
            //soutm //현재 함수명
                System.out.println("Step2.main");
            //soutp // 현재 함수의 매개변수 출력
                System.out.println("args = " + Arrays.toString(args));
            //soutv //가장 가까운 변수의 값 출력
                System.out.println("job = " + job);


    }//main e
}//class e
