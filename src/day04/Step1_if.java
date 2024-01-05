package day04;

import java.util.Random;

public class Step1_if { // c s
    public static void main(String[] args) { // m s

        // p.110
            // 제어문 : 1.조건문 2.반복문
            // 흐름제어 : 조건문 ({} 이후 정상적 흐름)
            //           반복문 ({} 이후 제어문으로 되돌아감) - 루핑

        //if 문
            //if(조건식){ 실행문 ; 실행문;}
            //if(조건식) 실행문 -> 가능 (실행문이 1개일때만) --> 비권장
        //p.111
        int score = 93;

        if(score>90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A등급 입니다.");
        }
        if(score<90)
            System.out.println("점수가 90보다 작습니다.");
        System.out.println("등급은 B등급 입니다."); // if 조건식에 관련없이 무조건 실행

        if(score>=90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A등급 입니다.");
        }else{
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B등급 입니다.");
        }

        if(score >=90){
            System.out.println("점수가 100~90 입니다.");
            System.out.println("등급은 A등급 입니다.");
        }else if(score>=80){
            System.out.println("점수가 90~80 입니다.");
            System.out.println("등급은 B등급 입니다.");
        }else if(score>=70){
            System.out.println("점수가 80~70 입니다.");
            System.out.println("등급은 C등급 입니다.");
        }else{
            System.out.println("점수가 70미만 입니다.");
            System.out.println("등급은 D등급 입니다.");
        }

        //1. Math.random() : 난수 함수
        System.out.println(Math.random());
        //2. Random() : 난수 객체.
        System.out.println(new Random().nextInt());

        //1.
//        int num = Math.random();                      //0.xx~1.xx
//        int num = Math.random()*6;                    //0.xx~1.xx *6 => 0~6미만
//        int num = Math.random()*6+1;                  //0.xx~1.xx *6 +1 => 1~7미만
        int num = (int)(Math.random()*6)+1;

        //2.
        Random random = new Random();
        //클래스명 변수명 = new 클래스명(); // 클래스에 해당하는 객체 생성 ( 객체 만드는 이유 : 라이브러리)
        //int num2 = random.nextInt(6); // int 허용 범위 내의 난수 생성 //bound 6 = 0~6 미만
        int num2 = random.nextInt(6)+1;
            //random.nextInt(범위개수)+시작번호;
        System.out.println(num2);

        if(num2==1){
            System.out.println("주사위가 1 입니다.");
        } else if (num2==2) {
            System.out.println("주사위가 2 입니다.");
        }else if (num2==3) {
            System.out.println("주사위가 3 입니다.");
        }else if (num2==4) {
            System.out.println("주사위가 4 입니다.");
        }else if (num2==5) {
            System.out.println("주사위가 5 입니다.");
        }else if (num2==6) {
            System.out.println("주사위가 6 입니다.");
        }else {
            System.out.println("주사위가 아닙니다!!!!!!");
        }


    }// m e
}// c e
