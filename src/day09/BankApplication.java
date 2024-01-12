package day09;

import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] Account = new Account[100];

        while(true){
            Account account = new Account();
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.println("선택 > ");
            String ch = scanner.nextLine();

            if(ch.equals("1")){
                System.out.println("-----------");
                System.out.println("계좌 생성");
                System.out.println("-----------");

                String 계좌번호="";
                String 계좌주="";
                String 입금초기금액 = "";

                System.out.print("계좌번호 : ");
                계좌번호 = scanner.nextLine();
                account.계좌번호=계좌번호;

                System.out.print("계좌주 : ");
                계좌주 = scanner.nextLine();
                account.계좌주=계좌주;

                System.out.print("입금초기금액 : ");
                입금초기금액= scanner.nextLine();
                account.입금초기금액=입금초기금액;

                System.out.println("결과 : 계좌가 생성되었습니다.");
                for(int i=0; i< Account.length;i++) {
                    if(Account[i]==null) {
                        Account[i] = account;
                        for(int j=0; j< Account.length;j++) {
                            if (Account[j] != null){
                                System.out.println(Account[j].계좌번호 + Account[j].계좌주 + Account[j].입금초기금액);
                            }
                        }
                        break;
                    }
                }

            }else if(ch.equals("2")){
                System.out.println("-----------");
                System.out.println("계좌목록");
                System.out.println("-----------");

                for(int i=0; i< Account.length;i++) {
                        for(int j=0; j< Account.length;j++) {
                            if (Account[j] != null){
                                System.out.println(Account[j].계좌번호 + Account[j].계좌주 + Account[j].입금초기금액);
                            }
                        }
                        break;
                }
            }else if(ch.equals("3")){

            }


        }
    }
}
