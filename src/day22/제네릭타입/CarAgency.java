package day22.제네릭타입;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
