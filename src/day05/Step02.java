package day05;

import java.sql.SQLOutput;

public class Step02 { //cs
    public static void main(String[] args) {//ms

        //p.165 : 배열(array) 타입
            /*
                -변수는 하나의 값만 저장....
                1. 배열 : 연속된 공간에 값을 나열하고 각 값에 인덱스를 부여.
                    인덱스 : 각 항목(요소)의 값을 호출 하거나 저장하는데 사용.
                2. 특징 :
                    1. 배열은 같은 타입의 값만 저장
                        int = [57, "가" ] --> 불가능!!!
                    2. 배열의 길이는 선언된 이후 늘리거나 줄일 수 없다.
                        int = [57, 62, 97] : 항목/요소를 추가/삭제 불가
                3. 선언
                    -배열 선언 : 타입[] 변수명 or int 타입 [];
                4. 값 목록으로 배열 선언
                    -배열 생성1 : 타입[] 변수명 = { 값0, 값1, 값2, 값3,  };
                    -배열 생성2 : 타입[] 변수명 = new 타입[ 길이 ];
             */

        //p.168 예제
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        System.out.println("season : "+season); //@6d311334 -> 배열의 주소값 (가상)
        System.out.println("season[0]"+season[0]);
        System.out.println("season[1]"+season[1]);
        System.out.println("season[2]"+season[2]);
        System.out.println("season[3]"+season[3]);
        //System.out.println("season[4]"+season[4]);
            //-Index 4 out of bounds for length 4 - > 인덱스가 3번까지 밖에 없음으로 오류가 나온다. 인덱스 오류!!


        //for반복문을 이용한 호출
        for(int i=0; i< season.length;i++){
            System.out.println("season["+i+"] :" +season[i]);
        }
        System.out.println();

        //각 요소의 값 수정하기
        season[1] = "여름";
        System.out.println("season[1]"+season[1]);
        System.out.println();

        int[] scores = {83, 90, 87};
        int sum =0;
        for(int i=0; i<scores.length;i++){
            sum += scores[i];
        }
        System.out.println("총합 : "+sum);
        double avg = (double) sum/scores.length;
        System.out.println("평균 : "+avg);



        //p.171 new 연산자를 활용한 배열 생성하기
        int[] arr1 = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("arr1["+i+"] :"+arr1[i]+",");
        }

        arr1[0] =10;
        arr1[1] =20;
        arr1[2] =30;
        for(int i=0; i<3; i++){
            System.out.println("arr1["+i+"] :"+arr1[i]+",");
        }
        System.out.println("\n");
        double[] arr2 = new double[3];
        for(int i=0; i<3; i++){
            System.out.println("arr2["+i+"] : "+ arr2[i] +",");
        }

        arr2[0]= 0.1;   arr2[1]= 0.2;   arr2[2]= 0.3;
        for(int i=0; i<3; i++){
            System.out.println("arr2["+i+"] :"+ arr2[i] +",");
        }
        System.out.println("\n");

        String[] arr3 = new String[3];
        for(int i=0; i<arr3.length; i++){
            System.out.println("arr3["+i+"] :" +arr3[i]);
        }
        arr3[0] = "1월";     arr3[1] = "2월";     arr3[2] = "3월";
        for(int i=0; i<arr3.length; i++){
            System.out.println("arr3["+i+"] :"+arr3[i]);
        }
    }//me
}//ce
