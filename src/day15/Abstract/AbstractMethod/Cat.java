package day15.Abstract.AbstractMethod;

public class Cat extends Animal{

    // 만일 상위클래스가 추상메소드가 있으면 필수
    // 추상 메소드 재정의/오버라이딩 한다.

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
