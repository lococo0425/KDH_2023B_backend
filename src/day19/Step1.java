package day19;

public class Step1 {
    public static void main(String[] args) {
        //1.인터페이스 변수 선언
            //RemoteControl rc;
        //2.구현 객체 선언
            //new Audio();
        //3. 구현 객체의 참조/주소 값을 인터페이스 변수에 대입
            //** 객체를 참조하는 인터페이스 타입의 변수
            // 다형성이므로 타입이 달라도 사용 가능
        RemoteControl rc = new Audio();

        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        //4. 인터페이스의 정적 메소드 호출
        RemoteControl.changeBattery();



    }
}
