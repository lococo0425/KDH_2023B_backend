package day09;

import java.util.Scanner;

public class Step1 {
    void powerOn(){
        //void : 리턴이 없다. : 함수가 종료 되어도 반환은 없다. => 메소드가 호출한 곳으로 전달하는 결과값이 없다.
        //powerOn : 함수명이고 카멜표기법 권장
        //() : 메소드를 호출할때 전달한 매개값을 받기 위한 곳
        //{} : 메소드가 실행되는 구역
        //return : void 이므로 생략
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

    int plus(int x, int y){
        int result = x+y;
        return result;
    }
    double divide(int x, int y){
        double result = (double)x/(double) y;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Step1 myCalc = new Step1();
        myCalc.powerOn();
        int x;
        int y;
        int resutl1 = myCalc.plus(x = scanner.nextInt(),y= scanner.nextInt());
        System.out.println("resutl1 = " + resutl1);



        double result2 = myCalc.divide(x,y);
        System.out.println("result2 = " + result2);

        myCalc.powerOff();
    }



}

