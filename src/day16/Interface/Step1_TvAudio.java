package day16.Interface;

public class Step1_TvAudio {
    public static void main(String[] args) {
        //1. 인터페이스 변수 선언
        RemoteControl rc;

        //2. 인터페이스 변수에 객체참조 값 대입
        rc = new Television(); //다형성
            // RemoteControl rc = new Television();
            //타입이 다른데 가능한 이유 : extends, implements

        //3. 인터페이스의 메소드 호출하면 구현객체의 메소드가 호출된다.
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();



        //rc 변수에 Audio 객체 대입
        rc=new Audio();
        rc.turnOn();
        rc.setVolume(7);
        rc.setMute(true);
        rc.setMute(false);
        rc.turnOff();

        System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);

    }
}
