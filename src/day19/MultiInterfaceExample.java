package day19;

public class MultiInterfaceExample {
    public static void main(String[] args) {
        //RemoteControl2 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl2 rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        //Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
        searchable.turnOn();
    }
}
