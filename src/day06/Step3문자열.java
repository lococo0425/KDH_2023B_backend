package day06;

import java.util.Scanner;

public class Step3문자열 {
    public static void main(String[] args) {
        //p.157 문자열 객체 함수
        //1. 문자 추출 문자열.charAt(index); 매개변수 : 추출문자인덱스번호 / 리턴값 : 추출된 문자(char)
        String ssn = "9506241230123";
        char sex = ssn.charAt(6);
        switch(sex) {
            case '1' :
            case'3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case'4':
                System.out.println("여자입니다.");
                break;
        }
        //문자 입력받기
        Scanner scanner =new Scanner(System.in);
        char c = scanner.next().charAt(0);
        //문자 열에서 특정 문자 겁색하기
        String str = "안녕하세요";
        for(int i=0; i<str.length();i++){
            System.out.println(str.charAt(i));
        }
        //2. 문자열 길이 : 문자열.length(); 매개변수 : 없음/ 반환값 : 문자열 길이(int)
            //- 공백을 포함함...
        int length = ssn.length();
        if(length==13){
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        }else{
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }

        //3. 문자열 대체 : 문자열.replace();
            //매개변수 : 변경할문자열 , 새로운문자열/ 반환값 : 대체된새로운문자열(String)
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
        String newStr = oldStr.replace("자바","JAVA");
        System.out.println(newStr);

            //특정 불필요한 데이터 대체하기
            //악의적인 데이터 대체 하기
            //욕설 필터링하기


        //4.특정 문자열 잘라내기 : 문자열.subString()
            //매개변수 : (1) (2) 시작인덱스, 끝인덱스    반환타입 : (String)
        String ssn2 = "880815-1234567";
        String firstNum = ssn2.substring(0,6); //0~5번 인덱스 까지 추출 (끝인덱스 앞꺼까지 추출)
        System.out.println(firstNum);

        String secondNum = ssn2.substring(7); // 7인덱스 부터 마지막인덱스 까지 추출
        System.out.println(secondNum);

        //5.문자열 찾기      : 문자열.indexOf()
            //매개변수 : "찾을문자열"  / 반환값 : 찾은문자열의인덱스번호[만약 없으면 -1 출력](int)

        String subject = "자바 프로그래밍";
        //"자바 프로그래밍" 문자열에서 "프로그래밍" 문자열 찾기
        int location = subject.indexOf("프로그래밍");
        String substring = subject.substring(location);
        System.out.println(substring);
        //----------------------------------------------------------------------------
        location = subject.indexOf("자바");
        if(location != -1){
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련없는 책이군요");
        }
        boolean result = subject.contains("자바");
        if(result){
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련없는 책이군요");
        }

        //6. 문자열 분리 : 문자열.split()
            //매개변수 : 구분문자 // 반환타입 : 배열(문자열[])
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
        String[] tokens = board.split(",");
        //1.
        System.out.println("번호 = " + tokens[0]);
        System.out.println("제목 = " + tokens[1]);
        System.out.println("내용 = " + tokens[2]);
        System.out.println("성명 = " + tokens[3]);
        //2.
        for(int i=0; i<tokens.length; i++){
            System.out.println(tokens[i]);
        }


    }
}
