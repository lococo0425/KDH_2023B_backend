package day06;

import java.util.Scanner;

public class Step4천단위쉼표 {//cs
    public static void main(String[] args) {//ms
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력(숫자형식으로 받기) : ");
        String money = scanner.nextLine();

        String result = "";

        //입력받은 문자열타입의 금액을 천단위 쉼표 반환
        for(int i = 0 ; i<money.length();i++){
            System.out.print(money.charAt(i)+ "  "); //입력받은 문자열들을 for문을 이용해 한 문자씩 추출.
            //천단위 쉼표 : 천단위 마다 , 추가

            if(i>0 && (money.length()-i)%3==0){
                result += ",";
            }

            result += money.charAt(i);
        }

        System.out.println("result = " + result);
    }//me
}//ce
