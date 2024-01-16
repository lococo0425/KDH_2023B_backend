package day11;

import day11.Car;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50); //유효성 검사
        System.out.println("현재속도 = " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);
        System.out.println("현재속도 = " + myCar.getSpeed());

        //멈춤  만약에 car 객체의 stop 필드가 false 이면 멈춰라
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재속도 = " + myCar.getSpeed());
    }
}
