package day11;

public class Step1 {
    public static void main(String[] args) {
        Korean k1 = new Korean("123456-1234567","김자바");
        day08.Korean korean = new day08.Korean("김동훈","123456789");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        k1.name="김자바";


        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EARTH_SURFACE_AREA);
    }
}
