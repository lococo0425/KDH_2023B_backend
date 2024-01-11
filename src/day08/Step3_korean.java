package day08;

public class Step3_korean {
    public static void main(String[] args) {
        //1. 정의된 생성자로 객체생성
        Korean k1 = new Korean("김동훈", "960425-1234567");

        System.out.println(k1);

       Korean k2 = new Korean("김자바","930525-0654321");
        System.out.println("k2 = " + k2);

        Korean k3 = new Korean();
        System.out.println(k3);
    }

}
