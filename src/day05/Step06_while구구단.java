package day05;

public class Step06_while구구단 {
    public static void main(String[] args) {
        // while 문 구구단
        int i=1, j =1;
        while (i<=9){
            System.out.println(i+"단");
            while(j<=9){
                System.out.println(i+"x"+j+"="+i*j);
                j++;
            }
            i++;
            j=1;
        }
        //자바 스왑
        int a= 20, b= 7, c= 15;
        int temp;
        if(a>b){
            temp = a;
            a =b;
            b=temp;
        }
        if(a>c){
            temp = a;
            a=c;
            c=temp;
        }
        if(b>c){
            temp =b;
            b=c;
            c=temp;
        }
        System.out.println(c);


    //무한루프 만들기
    // for(;;){ System.out.println("a")}
    // while(true){System.out.println("a")}

    }
}

