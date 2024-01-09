package day06;

import java.util.Scanner;

public class step5시간더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간 (hhmmss)형식 : " );
        String time = scanner.nextLine();
        System.out.print("시간 (숫자) : ");
        String second = scanner.nextLine();


        String result = "";
        //입력받은 time 에서 second 만큼 지난 시간을 hhmmss 형식으로 출력
        //초
        int ss = Integer.parseInt(time.substring(4,6));
        ss+=Integer.parseInt(second);

        //분
        int mm = Integer.parseInt(time.substring(2,4));
        //초를 60으로 나눈 값의 몫을 분에 더한다.
        mm += (ss/60);

        //시
        int hh = Integer.parseInt(time.substring(0,2)) ;
        hh+=(mm/60); //분을 60으로 나눈 값의 몫을 분에 더한다.
        hh = hh>24 ? hh-hh/24 : hh;

        System.out.printf("%2s : %2s : %2s \n",hh,(mm%60 <10 ? "0"+mm%60 : mm%60),ss%60<10 ? "0"+ss%60 : ss%60 );

        result = (hh<10?"0"+hh:hh)+" : "+(mm%60 <10 ? "0"+mm%60 : mm%60)+" : "  + (ss%60<10 ? "0"+ss%60 : ss%60);



    }
}
