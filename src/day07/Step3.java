package day07;

public class Step3 {
    public static void main(String[] args) {
        //여러개 자료를 관리하는 방법
        //이름이 '유재석' 이고 전화번호가 '010-3333-3333' 이고 나이 '53'일때

        //1. 변수
        String 이름 = "유재석";
        String 전화번호 = "010-3333-3333";
        int 나이 = 53;
        //주의할점 : 인원이 증가하면 그 인원수*3 만큼의 변수들이 필요

        //2. 배열
        String[] 이름명단 = {"유재석"};
        String[] 전화번호명단 = { "010-3333-3333"};
        int[] 나이명단 ={53};
            //주의할점 : 동일한 타입의 데이터 들만 나열 가능
        String[] 명단 = {
                "유재석","010-3333-3333","53",
                "강호동","010-4444-4444","55"
        };
            //주의할점 : 관리가 너무 어려움....

        //3.문자열
        String 인원 ="유재석,010-3333-3333,53";
        String[] 인원명단 = {인원, 인원};
        //vs 여러개의 자료들을 하나의 문자열로 합치기 [!!! : 구분자 활용]
        String[] 인원명단1 = {"유재석,010-3333-3333,53\n강호동,010-4444-4444,55"};
            //1. 사람구분 : \n
            //2. 사람 마다의 정보 : ,

        //4.클래스/객체
            //서로 다른 타입들을 하나의 타입 묶음.
//            class 사람{String String int}
//        사람 m = new 사람();
//        사람 m = new 사람();
//
//        사람[] 인원명단2 = {m(String String int), m(String String int)}
//

    }
}

