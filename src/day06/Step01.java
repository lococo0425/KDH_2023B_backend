package day06;

public class Step01 {
    public static void main(String[] args) {
        //p.149 null!!
            // - 아직 참조(번지)를 저장하고 있지 않다는 뜻을 가짐.
        int[] intArray = null;

        //intArray[] = 10;
            // 배열변수(스택영역)은 있지만 . 배열 객체 가 실제로 존재 하지 않음.

        String str = null;
            // 스택영역에 변수 생성 : str
        // System.out.println("str.length() = "+ str.length()); -> NullPointerException 에러 발생
    //---------------------------------------------p151-------------------------------------------------
        //GC : 쓰레기 수집기
            //- 자바는 객체(힙영역)을 직접 제거하는 방법을 제공하지 않음
            //      - 그 객체의 모든 참조를 없애는 방법 -> null

        String hobby = "여행";
            //String hobby : 스택영역에 생성된 변수
            //"여행" : 힙영역에 생성된 문자열객체 [102번지]
            // = 대입  102번지를 hobby변수에 대입
        hobby = null;
            //hobby변수가 null을 가짐
            // "여행" 객체는 현재 아무도 참조하지 않기 때문에 잠시 후 자동으로 힙 영역 삭제
        String kind1 = "자동차";
            //String kind1 : 스택영역           힙 "자동차[103번지]
        String kind2 = kind1;
            //String kind1 : 스택영역           kind1[103번지]
        kind1 = null;
        System.out.println("kind2 = " + kind2);



        // 배열 복습
        /*
            1. 배열 선언
            String[] array2 = new String[2]
            2. 배열의 항목 호출
            array2[index]
            3. 항목/요소 값 수정/변경
            array2[index] = 새로운 값
            4. 항목/요소 삭제 : 없음 [ 자바는 힙영역을 제거하는 방법을 제공하지 않음]
                -배열의 크기는 줄이거나 늘릴수 없다. -> 방법 : 1.직접함수만들기 , 2. 라이브러리

            5. 배열 구조
                5-1.스택은 배열의 0번 인덱스 주소를 참조한다.
                    -인덱스 마다 주소값
                        ex) {"유재석", "강호동"} -> 101번지 102번지
                String[] array1 = {"유재석","강호동"};

                 스택영역                                           힙영역
                String[] array1                                  1.배열객체 = {103번지, 104번지};   100번지
                                                                 2.문자열객체 = "유재석"  =         103번지
                                                                 3.문자열객체 = "강호동"  =         104번지
             ---------------------------------------------------------------------------
                String[] array2 = new String[2]
                    스택영역                                                 힙영역 new String[2]
                   String[] array2                                          1.배열객체 = { null,null};          201번지
                                                                            2.배열객체 = {204번지, null};        201번지
                                                                                           ↑
                   1.배열내 특정 항목 대입                                                    ↑
                   array2[0] = "유재석"                                                     ↑
                                                                            1. 문자열(유재석)객체 =                 204번지
                   array2[0] = array1[1]

         */
        //1.
        String[] array1 = {"유재석", "강호동"};
        String[] array2 = new String[2];

        System.out.println("array2 = " + array2);
        System.out.println("array2[0] = " + array2[0]);
        array2[0] = "유재석";
        System.out.println("array2[0] = " + array2[0]);

    }

}
