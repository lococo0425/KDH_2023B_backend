package day22;

public class Box3<T> {
    // 제네릭타입 : 클래스 선언시 타입을 정하지 않고 시작
    //1.필드
    private  T t; //t필드는 제네릭타입


    //메소드
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


}
