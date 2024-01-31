package day22.제네릭타입;

public interface Rentable<P> {

    P rent(); // 렌탈 반환 타입 정해져 있지 않다.


    //구현클래스 : 추상메소드의 실행부를 오버라이딩. / 추상메소드의 반환타입 정의
}
