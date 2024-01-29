package day19;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //default 메소드 오버라이딩
    void setMute(boolean mute);

    //4.정적[static]메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교환합니다.");
        System.out.println(MAX_VOLUME); //상수필드 호출 가능
        //turnOn(); // 실행부가 없으므로 불가능
        //setMute(); // default 인스턴스 메소드 이므로 불가능

    }

    //5. private vs public
        //private : 내부(클래스,인터페이스) 에서 접근 가능
        //1. 추상 메소드 : 다른 곳에서 구현을 해줘야 하는 메소드
        //private abstract  void turnOff(); <---------불가!!!

        //2. 디폴트메소드 : 구현객체
        //private default void turnOff2(){} <---------불가!!!
    private void turnOff3(){}
        //3. 정적메소드 : 구현객체 필요 없음
    public static void turnOff4(){};  //<-------------가능!!!!


}
