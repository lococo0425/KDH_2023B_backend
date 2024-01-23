package day16.Interface;
    // 추상 클래스와 인터페이스를 사용 하는 이유 : **다형성**

public interface RemoteControl { //텔레비전, 오디오 조작하는 리모컨

    //public 추상 메소드 : 서로 다른 객체들 간의 공통적인 메소드를 추출한 것
        // 1. 선언부만 작성하고 구현부는 작성하지 않는다.
        // 2.
            // 추상클래스의 public 추상메소드는 abstract 명시하지만
            // 인터페이스의 public 추상메소드는 abstract 생략이 가능하다.

        // 텔레비전과 오디오의 공통적인 메소드 추출 (= 전원 버튼)
    void turnOn();
    //추상 메소드!!
    void turnOff();
    void setVolume(int volume);



    //인터페이스는 인스턴스 필드와 정적 필드를 가질 수 없다.

    //상수 필드 : public static final
    int MAX_VOLUME =10;
    //public static final int MIN_VOLUME =0; [public static final 생략 가능]
    int MIN_VOLUME =0;

    //default 메소드
    default void setMute(boolean mute){
        if(mute){
            System.out.println("무음처리합니다.");
            setVolume(MIN_VOLUME);
        }else{
            System.out.println("무음 해제 합니다.");
        }
    }

}
