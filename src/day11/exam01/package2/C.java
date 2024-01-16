package day11.exam01.package2;

import day11.exam01.package1.B;

public class C {
    //다른 패키지 내 (default/public)클래스 호출
    //1. default
//        A a; //오류 발생 : default 클래스는 다른 패키지에서 사용불가
    //2. pubic
        B b; // public 클래스는 다른 패키지에서 사용 가능
}
