package Project_solo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {//class s
    public static void main(String[] args) { //main s
        Scanner scanner = new Scanner(System.in);
        String id = "";
        String pw = "";
        List<String> memberList = new ArrayList<>();
        List<String> idList = new ArrayList<>();
        List<String> pwList = new ArrayList<>();

    while(true) {//while s
        //회원가입
        System.out.print("ID 입력하세요 : ");
        idList.add(id = scanner.nextLine());
        System.out.print("PW 입력하세요 : ");
        pwList.add(pw = scanner.nextLine());
        String memberIDPW = "";
        for (int i = 0; i < idList.size(); i++) {
            memberIDPW = id + ":" + pw;
            }
        memberList.add(memberIDPW);
        System.out.println(memberList);

        //로그인 검사.
        System.out.println("로그인할 id를 입력하세요 : ");
        String idIdentify = "";
        idIdentify = scanner.nextLine();
        System.out.println("로그인할 pw를 입력하세요 : ");
        String pwIdentify = "";
        pwIdentify = scanner.nextLine();
        boolean found = false;
        int i = 0;
        for (i = 0; i < memberList.size(); i++) {
                String[] part = memberList.get(i).split(":");

                if (idIdentify.equals(part[0]) && pwIdentify.equals(part[1])) {
                    System.out.println("id와 pw가 일치합니다.");
                    found = true;
                    break;
                } else if (!idIdentify.equals(part[0]) && pwIdentify.equals(part[1])) {
                    System.out.println("id가 일치하지 않습니다.");
                    found = true;
                    break;
                } else if (idIdentify.equals(part[0]) && !pwIdentify.equals(part[1])) {
                    System.out.println("pw가 일치하지 않습니다.");
                    found = true;
                    break;
                }
            }

        // 마지막 인덱스 처리
            if (!found && memberList.size() > 0 && memberList.size() - 1 == i) {
                System.out.println("없는 정보입니다.");
            }


         }// while e
    }//main e
}// class e
