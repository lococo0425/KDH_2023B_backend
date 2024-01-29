package day19.인터페이스상속;

public class ExtendExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
//        ia.methodB(); ---> 불가능
//        ia.methodC(); ---> 불가능
        System.out.println();

        InterfaceB ib = impl;
//        ib.methodA(); ---> 불가능
        ib.methodB();
//        ib.methodC(); ---> 불가능
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();

    }
}
