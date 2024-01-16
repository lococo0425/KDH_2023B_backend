package day11;

public class Car {
    //클래스 멤버
        //1. (public, private (default))(정적/인스턴스, fianl)필드
    private int speed; // private 인스턴스 필드
    private boolean stop; // private 인스턴스 필드



    //2. (public, private (default))생성자

    //3. (public, private (default))메소드
        //3-1. 외부로 부터 필드 값을 반환해주는 메소드
    public int getSpeed(){return speed;}
        //3-2. 외부로부터 매개값을 필드 값에 대입해주는 메소드
    public void setSpeed(int speed){
        if(speed<0){
            this.speed =0;
            return;
        }else{
            this.speed = speed;
        }
    }
    //3-1  외부로부터 필드값을 반환해주는 메소드
    public boolean isStop(){
        return stop;
    }//3-2 외부로부터 매개변수 값을 유효성 검사를 통해 필드 값을 변경
    public void setStop(boolean stop){
        this.stop = stop;
        if(stop==true){
            this.speed =0;
        }
    }
}
