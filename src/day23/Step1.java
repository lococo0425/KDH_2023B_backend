package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {

        //1.배열
        String[] strArray = new String[3]; //String 타입 데이터 3 개를 저장하는 배열
        strArray[0] = "유재석";
//        strArray[1] = 100;        타입이 다르므로 불가능
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
//        strArray[3] = "서장훈";    ArrayIndexOutOfBoundsException 오류 발생
        System.out.println("배열 상태 : "+strArray); // 주소값을 보여줌... 값을 봐야 한다면 toString() 사용 혹은 아래 줄처럼 코딩
        System.out.println("배열 상태 : "+ Arrays.toString(strArray));


        //2.클래스타입 : 컬렉션프레임워크( 수집관련 라이브러리 제공 )
            //1. ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
        //클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
//        strList.add(100);             타입이 다르므로 불가능!!!!
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");
        System.out.println("리스트 상태 : "+strList);
        System.out.println("리스트 요소 호출 : " + strList.get(1));
        System.out.println("리스트 길이 : "+strList.size());
        strList.remove(1);
        System.out.println(strList);

        //3.가변길이배열객체 만들기
        SimpleList<String> simpleList = new SimpleList();
        simpleList.add("유재석");

        SimpleList<Integer> intlist = new SimpleList<>();
        intlist.add(100);
        intlist.add(200);
        intlist.add(300);
        simpleList.remove(1);


        System.out.println("리스트 요소 호출 : "+simpleList.get(1));
        System.out.println(simpleList.size());


    }
}
