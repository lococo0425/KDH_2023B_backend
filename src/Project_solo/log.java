package Project_solo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class log {
    private static final List<String> inputList = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true){
                System.out.print("저장할 로그 : ");
                String savelog = scanner.nextLine();

                if(savelog.equalsIgnoreCase("exit")){
                    break;
                }
                inputList.add(savelog);

                logInput("입력 값 : " +savelog);

            }
            System.out.println(inputList);


        }catch(Exception e){
            e.printStackTrace();
        }


    }
    private static void logInput(String logMessage) {
        try (FileWriter writer = new FileWriter("inputLog.txt", true)) {
            // 로그 파일에 메시지 추가
            writer.write(logMessage + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


