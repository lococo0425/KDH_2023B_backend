package day03;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //문제1 : 하나의 정수형으로  입력받아 7의 배수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("정수를 입력 하세요 : "); int 정수1 = scanner.nextInt();
//        String 출력1 = " ";
//        출력1 = (정수1%7==0)? "O" :"X";
//        System.out.println("입력받은 정수는 7의 배수가 : " + 출력1);
////문제2 : 하나의 정수형으로  입력받아 홀수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("정수를 입력 하세요 : "); int 정수2 = scanner.nextInt();
//        String 출력2 = " ";
//        출력2 = (정수2%2==0)? "X" : "O";
//        System.out.println("입력받은 정수는 홀수가 : " +출력2);
//
////문제3 : 하나의 정수형으로  입력받아 7의 배수 이면서 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("정수를 입력하세요 : "); int 정수3 = scanner.nextInt();
//        String 출력3 = " ";
//        출력3 = (정수3%7==0)? (정수3%2==0) ? "O":"X" :"X";
//        System.out.println("7배수 이면서 짝수 : " + 출력3);
//
////문제4 : 하나의 정수형으로  입력받아 11의 배수 이거나 짝수 이면 'O' 아니면 'X' 출력 하시오.
//        System.out.print("정수를 입력하세요 : "); int 정수4 = scanner.nextInt();
//        String 출력4 = " ";
//        출력4 = (정수4%11==0)? (정수4%2==0) ? "O":"X":"X";
//        System.out.println("11배수 이면서 짝수 : " + 출력4);

//문제5 : 두개의 정수형으로 입력받아 더 큰수 출력 하시오.
//        System.out.print("숫자 1을 입력하세요 :  ");
//        int num1 = scanner.nextInt();
//        System.out.print("숫자 2를 입력하세요 : ");
//        int num2 = scanner.nextInt();
//        System.out.println(num1>num2? num1:num2);

//문제6 : 정수형으로 반지름을 입력받아 원 넓이 출력 하시오. 소수점 둘째 자리 까지 출력하시오.
   //계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//        System.out.print("반지름 : ");
//        int r = scanner.nextInt();
//
//        double 원넓이 = r*r*3.14;
//
//        System.out.printf("원 넓이 : %.2f" ,원넓이);
//문제7 : 실수형으로 두번 입력받아 앞 실수의 값이 뒤의 값의 몇% 인지 소수점 첫째 자리까지 출력하시오.
   //예) 54.5   84.3 실수 2개입력시 결과는   64.285714%
//        System.out.print("앞 수 : ");
//        double num1 = scanner.nextDouble();
//        System.out.print("뒷 수 : ");
//        double num2 = scanner.nextDouble();
//
//        double result = num1/num2*100;
//        System.out.printf(" 앞 수는 뒷 수의 %.1f %% 입니다.",result);

//문제8 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 , 소수점 첫째 자리까지 출력하시오.
   //계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2
//        System.out.print("윗변 : ");
//        double 윗변 = scanner.nextDouble();
//        System.out.print("아랫변 : ");
//        double 아랫변 = scanner.nextDouble();
//        System.out.print("높이 : ");
//        double 높이 = scanner.nextDouble();
//
//        double 넓이 = (윗변+아랫변)*높이/2;
//
//        System.out.printf("넓이 = %.1f" , 넓이);
//문제9 : 키를 정수를 입력받아 표준체중 출력하기 , 정수형으로 출력하시오.
   //계산식) 표준체중 계산식 = > (키 - 100) * 0.9
//        System.out.print(" 키 : ");
//        int 키 = scanner.nextInt();
//
//        int 표준체중 = (int) ((키-100)*0.9);
//
//        System.out.println("표준 체중 : "+표준체중);

//문제10 : 키와 몸무게를 입력받아 BMI 출력하기 , 소수점 둘째 자리 까지 출력하시오.
   //계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//        System.out.print("키 : ");
//        double 키 = scanner.nextDouble();
//        System.out.print("몸무게 : ");
//        double 몸무게 = scanner.nextDouble();
//
//        double BMI = 몸무게 / ((키 / 100) * (키 / 100));
//
//        System.out.printf("BMI = %.2f",BMI);

//문제11 : inch 를 입력받아 cm 로 변환하기  , 소수점 둘째 자리까지 출력하시오.
  // 계산식) 1 inch -> 2.54cm
//        System.out.println("inch 를 입력하세요");
//        double inch = scanner.nextDouble();
//
//        double cm = inch*2.54;
//        System.out.printf("%.2f cm입니다.",cm);

//문제12:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오
  // 계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %
//        System.out.println("중간 고사 : ");
//        double 중간고사 = scanner.nextDouble();
//        System.out.println("기말 고사 : ");
//        double 기말고사 = scanner.nextDouble();
//        System.out.println("수행 평가 : ");
//        double 수행평가 = scanner.nextDouble();
//
//        double 비율반영중간 = 중간고사 * 0.3;
//        double 비율반영기말 = 기말고사 * 0.3;
//        double 비율반영수행 = 수행평가 * 0.4;
//
//        System.out.printf("중간고사 : %.2f 기말고사 :%.2f 수행평가 : %.2f", 비율반영중간,비율반영기말,비율반영수행);

//문제13 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
//   int x = 10;
//   int y = x-- + 5 + --x;
        //1. 초기 x 값 10 -> x-- : x 값 출력후 감소 => 10+5 + --x 상태 이때 x 값은 출력후 감소 했기 때문에 9
        //2. 10+5+ --x -> --x : 값 감소 후 출력 => 현재 값 9인 상태에서 하나 감소 후 출력 = 8
        //3. 고로 10 +5+8 이 되어서 y 값은 23 이다 된다.
        //4. x의 경우 초기 값은 10 이었으니 연산후 남은 현재 x 값이 8 이다.
//   System.out.printf(" x의 값 : %d , y의값 :  %d ", x, y);
        // x =8            y=10+5+8=23

//문제14 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기
//        System.out.print("나이 : ");
//        int age = scanner.nextInt();
//
//        if(age>=10&&age<20){
//            System.out.println("학생");
//        } else if (age>=20&&age<40) {
//            System.out.println("성인");
//        }else if(age>=40){
//            System.out.println("중년");
//        }

//문제15 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력
//        System.out.print("국어 : ");
//        int 국어 = scanner.nextInt();
//        System.out.print("수학 : ");
//        int 수학 = scanner.nextInt();
//        System.out.print("영어 : ");
//        int 영어 = scanner.nextInt();
//
//        double 총점 = 국어+수학+영어;
//        double 평균 = (국어+수학+영어)/3;
//
//        System.out.printf("총점 : %.0f , 평균 : %.2f", 총점,평균 );

//문제16 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 '로그인성공' 아니면 '로그인실패' 출력
//        System.out.print("아이디를 입력하세요");
//        String ID = scanner.nextLine();
//        System.out.print("비밀번호를 입력하세요");
//        String Password = scanner.nextLine();
//
//        if(ID.equals("admin") && Password.equals("1234")){
//            System.out.println("로그인성공");
//        }else {
//            System.out.println("로그인실패");
//        }

//문제17 : 3개의 정수형으로 입력받아 가장 큰수 출력
//        System.out.print("num1 을 입력하세요 : ");
//        int num1 = scanner.nextInt();
//        System.out.print("num2 을 입력하세요 : ");
//        int num2 = scanner.nextInt();
//        System.out.print("num3 을 입력하세요 : ");
//        int num3 = scanner.nextInt();
//
//        int maxnum = num1 > num2 ? num1 > num3 ? num1 : num3 : num2 > num3 ? num2 : num3;
//
//        System.out.printf("가장 큰수는 : %d 입니다. ",maxnum);

        System.out.print("num1 을 입력하세요 : ");
        int num1 = scanner.nextInt();
        System.out.print("num2 을 입력하세요 : ");
        int num2 = scanner.nextInt();
        System.out.print("num3 을 입력하세요 : ");
        int num3 = scanner.nextInt();

        if(num1<num2){
            int temp =num1;
                num1=num2;
                num2=temp;
        }
        if (num1<num3) {
            int temp =num1;
                num1= num3;
                num3= temp;
        }
        if (num2<num3) {
            int temp =num2;
                num2=num3;
                num3=temp;
        }
        System.out.println("가장 큰 수는 : " + num1);
    }
}
