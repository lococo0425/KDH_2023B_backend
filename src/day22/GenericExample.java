package day22;

public class GenericExample {
    public static <T> Box3<T> boxing(T t){ // 타입 파라미터 T 정의
        Box3<T> box = new Box3<T>();
        box.setT(t);
        return box;
    }

    //p.582
    //제네릭 메소드 : 제한된 파라미터
    public static <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1==v2;
    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing(100); //T 값을 Integer 으로 대체
        int intValue = box1.getT();
        System.out.println(intValue);

        Box3<String> box2 = boxing("홍길동"); //T 값을 String 으로 대체
        String strvalue = box2.getT();
        System.out.println(strvalue);
        System.out.println();
        System.out.println();




        //p.582
        boolean result1=compare(10,20); //
        System.out.println(result1);
        System.out.println();

        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }




}
