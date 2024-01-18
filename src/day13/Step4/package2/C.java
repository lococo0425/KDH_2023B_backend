package day13.Step4.package2;

import day13.Step4.package1.A;

public class C {
    public void method(){  //접근 제한자가 protected 일 경우 동일 패키지 에서만 접근 가능
        //A a = new A();          //다른 패키지 이므로 불가
        //a.field = "value";      //다른 패키지 이므로 불가
        //a.method();             //다른 패키지 이므로 불가
    }
}
