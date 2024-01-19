package day14;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();

        //Parent  타입으로 필드 메소드 사용
        parent.field1="data";
        parent.method1();
        parent.method2();
        /*
        parent.field2 = "data2";        불가능
        parent.method3();               불가능
         */

        //강제 타입 변환
        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();
    }
}
