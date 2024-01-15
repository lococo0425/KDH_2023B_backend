package day10;

public class Step3 {
    public static void main(String[] args) {
        //객체 생성
        Car myCar = new Car();
        //필드에 5를 저장
        myCar.setGas(5);

        if(myCar.isLeftGas()){
            System.out.println("출발합니다.");
            myCar.run();

        }
        System.out.println("gas를 주입하세요");
    }
}
