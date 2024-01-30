package day20.익명객체;

public class Car {
    private  Tire tire1 = new Tire();
    //익명 자식 객체
    //private Tire tire2 = new KumhoTire();
    //private Tire tire2 = new Tire(){재정의하기}
        // - 자식 클래스가 없다. -> 설계도 없다 -> 재사용 불가..
    private  Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("금호타이어가 굴러 갑니다.");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }

    public void run2(){
        //지역변수에 익명자식객체 대입
        Tire tire = new Tire(){
            @Override
            public void roll() {
                System.out.println("한국타이어가 굴러 갑니다.");
            }
        };

    }

    public void run3 (Tire tire){
        //매개변수에 익명자식 객체 대입
        tire.roll();
    }
}
