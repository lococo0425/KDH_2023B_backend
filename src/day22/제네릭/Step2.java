package day22.제네릭;

import java.util.ArrayList;

public class Step2 {
    public static void main(String[] args) {

        // * 클래스 선언시 객체 필드의 타입을 다양하게 사용하기 위해.
        // - 1.Object, 타입변환 필요 2. 제네릭 < > 사용, 타입변환 필요 없음


        // 1. Product 클래스에  TV 타입 과 String 타입 정의
        Product<Tv, String> product1 = new Product<>();

        //대입
        product1.setKind(new Tv());
        product1.setModel("스마트 TV");
        //호출
        Tv tv = product1.getKind();
        String model1 = product1.getModel();
        //------------------------------------//

        Product<Car , String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV 자동차");

        Car car = product2.getKind();
        String model2 = product2.getModel();

        //
        ArrayList<String> arrayList = new ArrayList<>();
        //1.ArrayList : 클래스
        //2. < ArrayList안에 넣을타입 > : 제네릭

    }
}
