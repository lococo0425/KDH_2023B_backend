package day13;

public class SportsCar extends Car{
    @Override
    public void speedUp() {
        speed += 10;
    }



    /* final 로 선언된 메소드 이므로 오버라이딩 할 수 없다.
    public void stop(){
        System.out.println("스포츠카 멈춤");
        speed=0;
    }
    */

}
