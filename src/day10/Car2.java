package day10;

public class Car2 {
    int speed;
    static int speed2;
    void run(){}

    static void simulate(){ //정적 메소드
        //System.out.println(this.speed); //static 메소드에서 인스턴스 필드 호출 불가능
        System.out.println(speed2);//static 메소드에서 정적필드 호출 가능
    }

    void simulate2(){ // 인스턴스 메소드
        System.out.println(this.speed); //static 메소드에서 인스턴스 필드 호출 가능
        System.out.println(speed2);//static 메소드에서 정적필드 호출 가능
    }

    public static void main(String[] args) {
        simulate();     //-> static 구역에서 static 메소드 호출 가능
        //simulate2();    -> static 구역에서 인스턴스 메소드 호출 불가능
            //해결책 : 객체를 만들어줌.

        new Car2().simulate2();
    }
}
