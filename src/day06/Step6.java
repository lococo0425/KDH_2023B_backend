package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Step6 { //cs
    public static void main(String[] args) { //ms
        Scanner scanner = new Scanner(System.in);
        String 전화번호부="";
        String[] arr =null;
        boolean run =true;


        while(run) {
            System.out.println("==================전화번호부==================");
            System.out.println("순번            이름           전화번호 ");


            System.out.println("1.전화번호등록 | 2.전화번호 삭제 | 3.전화번호 출력 ");
            int no = scanner.nextInt();
            scanner.nextLine();

            if(no==1){

                System.out.println("이름 / 전화번호 <---- 이렇게 입력하세요");
                String info = scanner.nextLine();
                전화번호부 += info + ",";
                // 이름   /   번호,이름   /   번호,이름  /  번호
                arr = 전화번호부.split(",");
                for(int i=0; i<arr.length;i++) {
                    System.out.printf("%d\t\t%s\t\t%s \n", i+1, arr[i].split("/")[0], arr[i].split("/")[1]);
                }

            }else if(no==2){
                int select =0;
                System.out.println("삭제할 번호를 선택하시오");
                select = scanner.nextInt();
                scanner.nextLine();
                arr = 전화번호부.split(",");
                if(select==1) {
                    arr[0] = null;
                    System.out.println(Arrays.toString(arr));

                } else if (select ==2) {
                    arr[1] = null;
                    System.out.println(Arrays.toString(arr));
                }else if(select ==3){
                    arr[2]=null;
                    System.out.println(Arrays.toString(arr));
                }
                전화번호부 = "";
                for(int i=0;i<arr.length;i++){
                    전화번호부 += arr[i]+",";
                }
            }else if(no==3){
                arr = 전화번호부.split(",");
                for(int i=0; i<arr.length;i++) {
                    System.out.println(arr[i]);
                }
            }
        }

    }//me
}//ce
 /*
        예제 전화번호부 만들기.
            [1.하나의 문자열만 사용해서 여러명의 이름과 전화번호를 관리.]
        String 전화번호부 = "";
            기능구현
                전화번호등록
                    -이름과 전화번호를 입력받아 저장
                전화번호 삭제
                    -출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 기록 삭제
                전화번호 출력
                    -String 전화번호부에 저장된 데이터를 아래 그림과 같이 출력

            실행화면
                ======전화번호부========
                순번      이름          전화번호
                1       김동훈         010-6860-4677
                2       유재석         010-1234-1234
                3       강호동         010-7777-7777

                1.전화번호 등록  2. 전화번호 삭제
                선택 >
       */