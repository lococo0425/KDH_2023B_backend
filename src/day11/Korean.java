package day11;

public class Korean {
    //final 필드는 값을 변경 할 수 없다.
    final  String nation = "대한민국";
    final String ssn;
    //비 final 필드는 값 변경이 가능하다.
    String name;



static final double EARTH_RADIUS =6400;
static final double EARTH_SURFACE_AREA;
static {
    EARTH_SURFACE_AREA= 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
}


public Korean(String ssn, String name){
    this.ssn = ssn;
    this.name = name;
}




}

