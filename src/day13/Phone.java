package day13;

public class Phone {
    //1.필드
    public String model;
    public String color;
    //2.생성자

    //3. 메소드

    public void bell(){
        System.out.println("벨이 울립니다.");
    }
    public void sendVoice(String message){
        System.out.println("자기:" +message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방: "+message);
    }

    public void hangUp(){
        System.out.println("전화를 끊습니다.");
    }
}
