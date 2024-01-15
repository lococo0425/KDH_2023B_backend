package day10;

public class Car {
    //1.필드
    int gas;
    //생성자 : 객체 생성시 new

    //메소드
        // 필드값 변경하는 메소드 [ 매개변수 : int /리턴 : X]
    void setGas(int gas){
        this.gas=gas;
    }

        // 필드 값에 따른 결과 반환 메소드 [매개변수:x / 리턴 boolean]
    boolean isLeftGas(){
        if(this.gas==0){
            System.out.println("gas 가 없습니다");
            return false;
        }
        System.out.println("gas 가 있습니다.");
        return true;
    }

    void run(){
        while(true){
            if(this.gas>0){
                System.out.println("달립니다. gas의 잔량 : "+this.gas);
                gas -= 1;
            }else{
                System.out.println("멈춥니다. gas의 잔량 : "+this.gas);
                return; // 메소드 종료 -> 무한루프 종료
            }
        }
    }

}
