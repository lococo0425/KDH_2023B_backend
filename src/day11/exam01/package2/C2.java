package day11.exam01.package2;

import day11.exam01.package1.A2;

public class C2 {

//+필드와 메소드 접근제한자
    public C2(){
        A2 a = new A2();

        a.field1 =1;
//        a.field2=1; // default 필드 접근 불가
//        a.field3=1; // private 필드 접근 불가


        a.method1();
//        a.method2(); //default 메소드 접근 불가
//        a.method3(); //private 메소드 접근 불가
    }




    //+생성자 접근제한자
    A2 a1 = new A2(true);

    //default 생성자 접근 불가
//    A2 a2 = new A2(1);

    //private 생성자 접근 불가
//    A2 a3 = new A2("문자열");
}
