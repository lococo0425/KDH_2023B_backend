package Project_solo.SoloProject.view;

import Project_solo.SoloProject.CSV.CSVReader;

import java.util.Scanner;

public class Ps_MovieView {

    public static void printMovie(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("-------------------영화-------------------");
            System.out.println("1.전체영화보기, 2.선택장르영화보기");
            int ch = scanner.nextInt();
            scanner.nextLine();

            if(ch==1){
                String[] args = new String[0];
                CSVReader.main(args);
            }else if(ch==2){

            }

    }
}
