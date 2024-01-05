package 팀과제.팀과제1;

import java.util.Scanner;

public class Step5_whileUse {// cs

    public static void main(String[] args) {//ms
        /*
        계산기 만들기
            1. 입력 받을 값 = 1.피연산자1 2.피연산자2 3.연산자

         */
        Scanner scanner = new Scanner(System.in);
        
        String num1 = null ;
        String operator = null;
        String num2 = null;
        boolean run = true;
        char temp;

        while (run) {

            boolean pass = true;

            System.out.println("숫자1을/를 입력하세요 : ");
            num1 = scanner.nextLine();

           for(int i=0; i<num1.length();i++){
               temp = num1.charAt(i);
               if( temp >= 48 && temp <=57 ){
                   num1 = num1;
               }else{
                   System.out.println("숫자가 아닙니다. 숫자를 입력하세요!!");
                   pass = !pass;
               }

           }
            if( !pass ){ continue; }

           System.out.println("연산자를 입력하세요 : ");
           operator = scanner.nextLine();


           System.out.println("숫자2을/를 입력하세요 : ");
            num2 = scanner.nextLine();

            for(int i=0; i<num2.length();i++){
                temp = num2.charAt(i);
                if( temp >= 48 && temp <=57 ){
                    num2 = num2;
                }else{
                    System.out.println("숫자가 아닙니다. 숫자를 입력하세요!!");
                    pass=!pass;
                }

            }
            if( !pass ){ continue; }
            if(operator.equals("+")){
                System.out.printf("%.5f\n",Double.parseDouble(num1)+Double.parseDouble(num2));
            } else if (operator.equals("-")) {
                System.out.printf("%.5f\n",Double.parseDouble(num1)-Double.parseDouble(num2));
            }else if (operator.equals("*")){
                System.out.printf("%.5f\n",Double.parseDouble(num1)*Double.parseDouble(num2));
            }else if (operator.equals("/")){
                System.out.printf("%.5f\n",Double.parseDouble(num1)/Double.parseDouble(num2));
            }else {
                System.out.println("연산자가 잘못 입력 되었습니다.");
                pass=!pass;
            }
            if( !pass ){ continue; }



        }


    }//me
}//ce


