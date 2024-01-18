package day13.Step4.package1;

public class B {
    public void method(){
        A a = new A(); // 같은 패키지 내에서 가능
        a.field = "value"; // 같은 패키지 내에서 가능
        a.method(); // 같은 패키지 내에서 가능

    }
}
