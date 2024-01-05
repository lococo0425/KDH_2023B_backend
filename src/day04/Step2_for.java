package day04;

public class Step2_for {
    public static void main(String[] args) {

        //p.124
        //for 문 안쓸래요!!
        System.out.println(1 + " ");
        System.out.println(2 + " ");
        System.out.println(3 + " ");
        System.out.println(4 + " ");
        System.out.println(5 + " ");
        System.out.println(6 + " ");
        System.out.println(7 + " ");
        System.out.println(8 + " ");
        System.out.println(9 + " ");
        System.out.println(10 + " ");
        //for 문 쓸래요!!
        for(int i=1; i<=10; i++){
            System.out.println(i+" ");
        }

        int sum = 0;
        int i;

        for(i=1;i<=100;i++){
            sum += i;
        }

        // for문 구구단
        System.out.println("1~" +(i-1)+ "합 : " +sum);

        for(int m=2; m<=9; m++){
            System.out.println("*** "+m+"단 ***");
            for(int n=1;n<=9;n++){
                System.out.println(m+"X"+n +"=" +(m*n));
            }
        }



    }
}
