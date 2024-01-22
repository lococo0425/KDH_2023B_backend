package day15.Abstract;

public class PhoneExample {
    public static void main(String[] args) {
        //1. 추상 클래스의 객체 생성
        SmartPhone smartPhone = new SmartPhone("홍길동");

        //2.
        SmartPhone smartPhone1 = new SmartPhone("홍길동");
        Phone phone1 = new SmartPhone("홍길동");

        //3.
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
