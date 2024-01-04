package day03;

public class Step1 { // c s
    public static void main(String[] args) { //m s
        //1. 산술 연산자 (결과 : 값)
        int x=10; int y=-3;
        System.out.println("x+y = "+(x+y));
        System.out.println("x-y = "+(x-y));
        System.out.println("x*y = "+(x*y));
        System.out.println("x/y = "+(x/y));
        System.out.println("x%y = "+(x%y));

        //2. 비교 연산자 ( 결과 : boolean)
        System.out.println("x==y : "+(x==y));
        System.out.println("x!=y : "+(x!=y));
        System.out.println("x>y : "+(x>y));
        System.out.println("x>=y : "+(x>=y));
        System.out.println("x<=y : "+(x<=y));
        System.out.println("x<y : "+(x<y));

        //3. 논리 연산자 (비교 연산자가 2개이상, 결과 : boolean)
        System.out.println("10 < x <20 : "+(10 < x && x<20));
        System.out.println("y==10 또는 ==20 : "+ (y==10||y==20));
        System.out.println("x>=30의 반대 : "+!(x>=30));

        //4. 증감연산자
        System.out.println("x++ : "+(x++)); // 출력후 증가
        System.out.println("x-- : "+(x--)); // 출력후 감소
        System.out.println("++x : "+(++x)); // 증가후 출력
        System.out.println("--x : "+(--x)); // 감소후 출력

        //5. (복합)대입연산자
        x= 30; // 오른쪽 값을 왼쪽에 대입
        x += 10; //x에 10을 더한후에 x에 결과 대입

        //6. 삼항 연산자
         //단항   // 조건 ? 참 : 거짓
         //다항   // 조건1 ? 참 : 조건2 ? 참2 : 거짓
        String 결과 = x > 90 ? "합격" : "불합격";
        System.out.println("결과 = " + 결과);

        String 결과2 = x>=90 ? "A등급": x>=80 ? "B등급" : "탈락";
        System.out.println("결과2 = " + 결과2);

        //7. 연결 연산자
            //변수 + "문자열" , "문자열" + "문자열"



    }// m e
}//c e
