package Project_solo;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader();
        List<List<String>> csvList = csvReader.readCSV();


        for (int i = 0; i < csvList.size(); i++) {
            List<String> row = csvList.get(i);
            for (int j = 0; j < row.size(); j++) {
                System.out.print(row.get(j) + "\t");
            }
            System.out.println();
        }
    }

    public List<List<String>> readCSV(){
        List<List<String>> csvList = new ArrayList<>();
        File csv = new File("C:\\Users\\504\\Desktop\\KDH_2023B_backend\\KDH_2023B_backend\\src\\Project_solo\\KC_KOBIS_BOX_OFFIC_MOVIE_INFO_202309.csv");
        BufferedReader br= null;
        String line = "";

        try{
            br = new BufferedReader(new FileReader(csv));
            while ((line = br.readLine())!=null){
                List<String> aline = new ArrayList<>();
                String[] lineArr = line.split(",");
                aline = Arrays.asList(lineArr);
                csvList.add(aline);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                if(br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return csvList;
    }
}
