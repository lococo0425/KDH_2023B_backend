package day10;

public class Step4 {
    public static void main(String[] args) {
        System.out.println(Calculator.pi); // 정적필드 호출
        //System.out.println(Calculator.pi2); // 인스턴스 필드 호출 불가
        //인스턴스 필드 사용시 객체 필요
        Calculator calculator = new Calculator();
        System.out.println(calculator.pi2);



        calculator.plus2(5,10);


        double result1 = 10*10*Calculator.pi;
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10,5);
        System.out.printf("%f,\t%d,\t%d",result1,result2,result3);

    }
}
