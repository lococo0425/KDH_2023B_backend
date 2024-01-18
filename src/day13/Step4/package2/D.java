package day13.Step4.package2;

import day13.Step4.package1.A;

public class D extends A {

    public D(){} // 부모의 생성자 호출
    public void method1(){
        this.field="value"; // 부모의 필드 호출
        this.method(); // 부모의 메소드 호출
    }

    public void method2(){
        //A a = new A();                  //상속을 받더라도 직접 객체 생성해서 사용 하는 것은 안됌
        //a.field = "value";              //상속을 받더라도 직접 객체 생성해서 사용 하는 것은 안됌
        //a.method();                     //상속을 받더라도 직접 객체 생성해서 사용 하는 것은 안됌
    }
}
