package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Step4_phone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone[] phoneBook = new Phone[100];

        while(true){
            System.out.println("==================전화번호부==================");
            System.out.println("순번            이름           전화번호 ");
            System.out.println("1.전화번호등록 | 2.전화번호 삭제 | 3.전화번호 출력 ");
            int no =scanner.nextInt();
            scanner.nextLine();
            if (no==1){
                System.out.print("이름 입력하세요");

                String 이름 =scanner.next();
                System.out.print("전화번호 입력하세요");
                String 전화번호 =scanner.next();

                Phone phone = new Phone();
                phone.이름 = 이름;
                phone.전화번호 = 전화번호;
                for(int i=0; i< phoneBook.length;i++) {
                    if(phoneBook[i]==null) {
                        phoneBook[i] = phone;
                        for(int j=0; j< phoneBook.length;j++) {
                            if (phoneBook[j] != null){
                                System.out.println(phoneBook[j].이름 + phoneBook[j].전화번호);
                            }
                        }
                        break;

                    }

                }

            }else if(no==2){
                int select =0;
                System.out.println("삭제할 번호를 선택하시오");
                select =scanner.nextInt();
                scanner.nextLine();
                if (phoneBook.length-1 == select){
                    phoneBook[phoneBook.length-1] = null;
                } else {
                    for (int i = 0; i < phoneBook.length-1; i++) {
                        if (select == i) {
                            phoneBook[i] = phoneBook[select + 1];

                        }
                    }
                }
                for(int j=0; j< phoneBook.length;j++) {
                    if (phoneBook[j] != null){
                        System.out.println(phoneBook[j].이름 + phoneBook[j].전화번호);
                    }
                }
            }else if(no==3){
                    for(int i=0 ; i< phoneBook.length; i++){
                        System.out.println(phoneBook[i].이름 + phoneBook[i].전화번호);
                    }
                }

            }

        }
    }
