package day11;

public class Singleton {
    //private 접근 권한을 갖는 정적 필드 선언과 초기화
    //2 필드에 미리 객체 생성
    private static Singleton singleton = new Singleton();

    //private 접근 권한을 갖는 생성자 선언
        //1.생성자를 외부로부터 호출 불가능으로 만들어주기
    private Singleton(){}

    //public 접근 권한을 갖는 정적 메소드 선언
    //3. 필드에 간접 접근을 이용한 객체
    public static Singleton getInstance(){
        return singleton;
    }
}
