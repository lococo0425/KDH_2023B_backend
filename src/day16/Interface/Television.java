package day16.Interface;

public class Television implements RemoteControl{
    private int volume;

    //구현 클래스 : 추상메소드를 구현한 클래스
        // - 구현 클래스가 꼭 필요한 이유
            //1. 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.

    @Override
    public void turnOn(){
        System.out.println("TV를 켭니다.");
    }
    public void turnOff(){
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else{
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

}


/*
    오버로딩 : 생성자/메소드 에서 매개변수의 타입/개수/순서 에 따라 여러개 선언
    오버라이딩 : 메소드 에서 extends / implements 한 메소드를 재정의
 */