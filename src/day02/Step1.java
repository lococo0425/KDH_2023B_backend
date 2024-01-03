package day02; // 현재 클래스 파일의 폴더위치

public class Step1 {
    public static void main(String[] args) {
        //p.53 자동 타입 변환
            //1. 작은 타입 허용범위가 큰 타입 혀용번위 내 대입될때
            // byte < short , char < int < long < float < double
        //p.55 강제 타입 변환 = 캐스팅
            //1. 큰 타입 허용범위가 작은 타입 허용 범위내 대입될때
                // byte > short , char > int > long > float > double
            //2. 데이터 손실 발생
                // 작은타입 = (작은타입)큰 타입

        //p.58 연산식에서 자동 타입변환 [더 큰 허용 범위를 갖는다]
            //1. byte, short 연산시 결과 타입 -> int
            //2. int, int 연산시 결과 타입 -> int
            //3. long, int 연산시 결과 타입 -> long
            //4. float, float 연산시 결과 타입 -> float
            //5. double, float 연산시 결과 타입 -> double

        //p.62
        byte result1 = 10+20; //컴파일 연산
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1+v2; // byte + byte = int

        byte v3 = 10; int v4 =100; long v5 = 1000L;
        long result3 = v3+v4+v5; // byte + int + long => long

        char v6 ='A'; char v7 = 1;
        int result4=v6+v7; //char+char => int

        int v8=10;
        int result5 = v8/10; //int/int => int

        int v9=10;
        double result6 = v9/4.0; //int/double => doulbe

        int v10=1;
        int v11=2;
        int result7 = v10/v11;  //int/int=>int [문제 없음. 단 소수점 표현 불가능]
        double result8 = (double)v10/v11;
        System.out.println(result7);
        System.out.println(result8);
    }
}
