package day01;

public class Step3 {
    public static void main(String[] args) {
        //p.41 진수 표현방법
        int var1 = 0b1011; // 2진수 : 데이터 앞에 0b
        System.out.println("var1 : " + var1);
        int var2 = 0206; // 8진수 : 데이터 앞에 0
        System.out.println("var2 : " + var2);
        int var3 = 365; // 10진수
        System.out.println("var3 : " + var3);
        int var4 = 0xB3; // 16진수 : 데이터 앞에 0x
        System.out.println("var4 : " + var4);

        //p.42 byte타입
        byte b1 = -128; System.out.println("b1 : "+b1);
        byte b2 = 127; System.out.println("b2 : "+b2);
        //byte b3 = 200; System.out.println("b2 : "+b3); //허용 범위 벗어남

        //short 타입 [대략 -32000~+32000]
        short s1 = 32000; System.out.println("s1 : "+s1);
        //short s2 = -50000; System.out.println("s2 : "+s2); //허용 범위를 벗어남.

        //int 타입 [대략 +-21억 정도] : 4바이트 [!!! : 정수타입 리터럴(그 값 자체)  ]
        int i1 = 2100000000; System.out.println("i1 : "+i1);
        //** int i2 = 3000000000; System.out.println("i2 : "+i2); //허용범위를 벗어남.
            //java : integer number too large

        //long 타입 [+- 21억 이상]: 8바이트   !!!: 정수타입 리터럴 뒤에 l/L을 붙여야 함.
        long l1 = 3000000000L; System.out.println("l1 : "+l1);

        //char 타입 : 2바이트 : !!! : ' '작은 따옴표 사용!!!!!
        char c1 = 'A'; System.out.println("c1 : "+c1);
        char c2 = 65; System.out.println("c2 : "+c2);
        char c3 = '가'; System.out.println("c3 : "+c3);
        char c4 = 44032; System.out.println("c4 : "+c4);
            //1. char 왜 정수형 타입입니까?
        int i3 ='A'; System.out.println("i3 : "+i3); //65
        char c5 = 80; System.out.println("c5 : "+c5);//P


        //[문자열]  : String     = ""큰따옴표 사용
        String str1 = "안녕하세요"; System.out.println(str1);
        String str2 = "나는 \"자바\"를 배웁니다."; System.out.println(str2);
        String str3 = "번호\t이름\t직업"; System.out.println(str3);

        //java/jdk 13 이후부터 가능한 문법
        String str4 = """ 
                나는 자바를
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;         System.out.println(str4);

        //float : 4바이트 : 소수점 8자리까지표현 : 반올림
            //float f1 = 0.123456789; //리터럴 문자 뒤에 f/F를 붙여서 사용 해야 한다.
            float f1 = 0.123456789123456789f; System.out.println(f1);
        //double : 8바이트 : 소수점 17번째자리까지표현    //실수 타입의 기본 타입!
            double d1 = 0.123456789123456789; System.out.println(d1);
        //boolean
            boolean bool1 = true;

    }
}