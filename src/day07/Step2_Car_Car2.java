package day07;

public class Step2_Car_Car2 {
    public static void main(String[] args) {

        //p.215
        //1.객체 생성
            //new
        //2.생성자 클래스명
            //new 생성자/클래스명()
        //3.변수선언    -> why? 다시 써야 하니까!!
            //Car car

        //1+2+3
        Car myCar = new Car();

        System.out.println("모델명 : "+myCar.model);
        System.out.println("시동여부 : "+myCar.start);
        System.out.println("현재속도 : "+myCar.speed);


        Car yourCar = new Car();

        System.out.println("모델명 : "+yourCar.model);
        System.out.println("시동여부 : "+yourCar.start);
        System.out.println("현재속도 : "+yourCar.speed);

        //p.217
        //필드는 객체의 데이터 이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.

        Car2 myCar2 = new Car2();

        System.out.println("제작회사 : "+myCar2.company);
        System.out.println("모델명 : "+myCar2.model);
        System.out.println("색깔 : "+myCar2.color);
        System.out.println("최고속도 : "+myCar2.maxSpeed);
        System.out.println("현재속도 : "+myCar2.speed);
        // 객체 내 필드값 수정
        myCar2.speed = 60;
        System.out.println("현재속도 : "+myCar2.speed);
        //=======================
        Car2 yourCar2 = new Car2();
        System.out.println("제작회사 : "+yourCar2.company);
    }
}
