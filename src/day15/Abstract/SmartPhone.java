package day15.Abstract;

public class SmartPhone extends Phone{
    //부모 생성자를 호출
    SmartPhone(String owner){
        super(owner);
    }

    //메소드 선언
    void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

}
