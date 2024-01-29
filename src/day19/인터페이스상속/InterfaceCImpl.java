package day19.인터페이스상속;

public class InterfaceCImpl implements InterfaceC{
    //자식 인터페이스를 구현 할때 부모 인터페이스도 구현 해야한다.
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }
}
