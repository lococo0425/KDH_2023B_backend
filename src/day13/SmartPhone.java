package day13;

public class SmartPhone extends Phone{

    //필드
    public boolean wifi;
    //생성자
    public SmartPhone(String model, String color){
        // - 생성자 첫줄에 부모 기본 생성자 호출 (생략 가능)
        super();

        this.model=model;
        this.color=color;
    }
    //메소드

    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
