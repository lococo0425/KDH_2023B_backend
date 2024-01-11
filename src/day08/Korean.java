package day08;

public class Korean {

    //클래스멤버
    //1.필드
    String nation = "대한민국";
    String name;
    String ssn;

    //2.생성자
        // 객체들간의 다른 값을 가져야 할때
            //1. 생성자 명을 작성한다. 단 클래스명도 동일
            //2. ( ) 안에 매개변수를 정의한다.
            //3. { } 안에 생성자 호출시 처리할 명령어/로직 작성
    Korean(){}
    public Korean(String n , String s){
        name =n;
        ssn =s;

    }
    //3.메소드
    //객체 주소값 대신 객체의 필드정보 출력시 사용되는 함수
    //Alt+insert -> 생성 -> toString()
    @Override
    public String toString() {
        return "Korean{" +
                "nation='" + nation + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }


}
