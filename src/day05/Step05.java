package day05;

import java.util.Scanner;

public class Step05 { //cs
    public static void main(String[] args) {//ms
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        //배열
        int[] students = new int[0]; //int 형 데이터를 여러개 저장 가능 한 배열 생성

        while(run){
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-------------------------------------------------");


            System.out.println("선택 : ");
            String ch = scanner.nextLine();

            if(ch.equals("1")){
                System.out.println("학생수 > ");
                String count = scanner.nextLine();
                //입력 받은 수 만큼 배열의 길이를 초기화 //p.172 참고 할것.
                students = new int[Integer.parseInt(count)];
            }
            else if (ch.equals("2")){ // 1번에서 입력 받은 학생 수 만큼 점수를 입력 받기
                for(int i=0; i<students.length;i++) {
                    System.out.printf("학생[%d]의 점수 :  > ", (i+1),i);
                    students[i] =Integer.parseInt(scanner.nextLine());
                }
            }
            else if (ch.equals("3")) {
                for (int i = 0; i < students.length; i++) {
                    System.out.printf("학생[%d] 점수 : %d \n", (i + 1), students[i]);
                }
            }
            else if(ch.equals("4")){
                int max = 0; //임의의 최저점 대입 하고 시작

                for(int i=0; i<students.length;i++){
                    if(students[i]>max){
                        max = students[i];
                    }
                }
                System.out.println("최고점 : " +max );

                double sum =0;
                for(int i=0; i<students.length;i++){
                    sum += students[i];
                }
                System.out.printf("평균 : %.1f \n",sum/ students.length);
            }
            else if(ch.equals("5")){
                System.out.println("프로그램을 종료 합니다.");break;}
            else{
                System.out.println("잘못된 입력입니다.");
            }

        }




    } // ce
}// me
