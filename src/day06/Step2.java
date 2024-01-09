package day06;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        //p.153 문자열 타입
        //1.문자열 선언
        String name;              //스택영역(변수)선언
        name = "홍길동";           //스택영역에 힙영역(객체)의 주소 대입
        String hobby = "여행";    //힙영역(객체)의 주소를 스택영역에 대입
        //2. 문자열 비교
            //1. ==
        String name1 = "홍길동";               //힙영역
        String name2 = "홍길동";               //힙영역
        System.out.println(name1==name2);     //true ???
            //2.
        String name3 = new String("홍길동");
        System.out.println(name2==name3); // false  [스택이 가지는 주소/참조 값 비교]

            //3.
        System.out.println(name1.equals(name2)); //같다(true)
        System.out.println(name2.equals(name3)); //같다(true) [스택이 가지는 주소/참조의 내부 비교]

            //4.
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next(); //입력받은 문자열은 반환된 문자열은 리터럴 인가 new문자열 인가?
        System.out.println(name1 == inputName); //false
        System.out.println(name1.equals(inputName)); //true   //--> new 문자열

            //5. null vs "" vs " "
        //null = 주소 없음 (객체 없다.)
        String hobby2 = "";
        if(hobby2.equals("")){
            System.out.println("hobby 변수가 참조는 Sting 객체는 빈 문자열");
        }
        // ↓ 오류 구문 why? null 값이므로 .equals 를 사용 할 수 없다.(NullPointException 에러)
//        String hobby3 = null;
//        if(hobby3.equals("")){ }

        //프로그램 도중에 hobby3 변수의 참조값이 변경 될 수 있으므로
        //↓ 처럼 확인...
//        if(hobby3!=null && hobby3.equals("")){
//            System.out.println("문자열 참조");
//        }




    }
}
