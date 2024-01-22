package day15.Vehicle;

public class Driver {

    public void drive(Vehicle vehicle){
        vehicle.run();
        System.out.println(vehicle instanceof Bus ? "버스입니다.":"택시입니다.");
        System.out.println(vehicle instanceof Taxi ? "택시입니다.":"버스입니다.");
        System.out.println(vehicle instanceof Object);

    Bus bus = new Bus(); //자식객체는 생성시 부모객체도 먼저 생성한다.
        System.out.println(bus instanceof Vehicle);
        //Object : 자바의 모든 클래스의 최상위 부모



    }
    // - 자식타입으로 다시 변환. (강제타입 캐스팅)
    //!!! : instanceof 연산자
    //객체명 instanceof 타입
    // instanceof 를 이용하여 객체의 타입을 알수 있다.


}
