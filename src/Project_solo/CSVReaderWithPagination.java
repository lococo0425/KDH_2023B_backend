package Project_solo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReaderWithPagination {
    private static final int ITEMS_PER_PAGE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CSVReaderWithPagination csvReader = new CSVReaderWithPagination();
        List<MovieInfo> movieList = csvReader.readCSV();

        List<MovieInfo> selectedGenreMovies = new ArrayList<>();

        printAllMovies(movieList);
        int page = 0;
        while (true) {
            System.out.println("현재 페이지: " + page);
            printMovies(selectedGenreMovies, page);

            System.out.println("이전 페이지: -1, 다음 페이지: 0, 특정 장르 보기: 1, 내가 선택한 장르 전체보기: 2, 종료: 3");
            int userInput = scanner.nextInt();
            scanner.nextLine();

            if (userInput == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (userInput == -1) {
                if (page > 0) {
                    page--;
                } else {
                    System.out.println("이전 페이지가 없습니다.");
                }
            } else if (userInput == 0) {
                int totalPages = (int) Math.ceil((double) selectedGenreMovies.size() / ITEMS_PER_PAGE);
                if (page < totalPages - 1) {
                    page++;
                } else {
                    System.out.println("다음 페이지가 없습니다.");
                }
            } else if (userInput == 1) {
                System.out.print("장르를 입력하세요: ");
                String selectedGenre = scanner.nextLine();
                selectedGenreMovies = filterMoviesByGenre(movieList, selectedGenre);
                page = 0; // 새로운 장르를 선택할 때 페이지를 초기화합니다.
            } else if (userInput == 2) {
                printAllMovies(selectedGenreMovies);
            } else {
                System.out.println("올바르지 않은 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }

    public static void printMovies(List<MovieInfo> movieList, int page) {
        int start = page * ITEMS_PER_PAGE;
        int end = Math.min((page + 1) * ITEMS_PER_PAGE, movieList.size());

        for (int i = start; i < end; i++) {
            System.out.println(movieList.get(i));
        }
    }

    public static void printAllMovies(List<MovieInfo> movieList) {
        for (MovieInfo movie : movieList) {
            System.out.println(movie);
        }
    }

    public static List<MovieInfo> filterMoviesByGenre(List<MovieInfo> movieList, String genre) {
        List<MovieInfo> filteredMovies = new ArrayList<>();
        for (MovieInfo movie : movieList) {
            if (movie.genreName.equals(genre)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies;
    }
    public List<MovieInfo> readCSV() {
        List<MovieInfo> movieList = new ArrayList<>();
        File csv = new File("C:\\Users\\504\\Desktop\\KDH_2023B_backend\\KDH_2023B_backend\\src\\Project_solo\\KC_KOBIS_BOX_OFFIC_MOVIE_INFO_202309.csv");
        BufferedReader br = null;
        String line = "";

        try {
            br = new BufferedReader(new FileReader(csv));
            // Read the header to skip it
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] lineArr = line.split(",");
                MovieInfo movieInfo = createMovieInfo(lineArr);
                movieList.add(movieInfo);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return movieList;
    }

    private MovieInfo createMovieInfo(String[] lineArr) {
        // Assuming the order of fields matches the CSV header
        int no = parseInteger(lineArr[0]);

        // Check if there are enough elements in lineArr
        String movieName = lineArr.length > 1 ? lineArr[1] : "";
        String directorName = lineArr.length > 2 ? lineArr[2] : "";
        String makerName = lineArr.length > 3 ? lineArr[3] : "";
        String incomeCompanyName = lineArr.length > 4 ? lineArr[4] : "";
        String distributionCompanyName = lineArr.length > 5 ? lineArr[5] : "";
        String openingDate = lineArr.length > 6 ? lineArr[6] : "";
        String movieTypeName = lineArr.length > 7 ? lineArr[7] : "";
        String movieStyleName = lineArr.length > 8 ? lineArr[8] : "";
        String nationalityName = lineArr.length > 9 ? lineArr[9] : "";
        int totalScreenCount = lineArr.length > 10 ? parseInteger(lineArr[10]) : 0;
        double salesPrice = lineArr.length > 11 ? parseDouble(lineArr[11]) : 0.0;
        int viewingNumber = lineArr.length > 12 ? parseInteger(lineArr[12]) : 0;
        double seoulSalesPrice = lineArr.length > 13 ? parseDouble(lineArr[13]) : 0.0;
        int seoulViewingNumber = lineArr.length > 14 ? parseInteger(lineArr[14]) : 0;
        String genreName = lineArr.length > 15 ? lineArr[15] : "";
        String gradeName = lineArr.length > 16 ? lineArr[16] : "";
        String movieSubdivisionName = lineArr.length > 17 ? lineArr[17] : "";

        return new MovieInfo(no, movieName, directorName, makerName, incomeCompanyName, distributionCompanyName,
                openingDate, movieTypeName, movieStyleName, nationalityName, totalScreenCount, salesPrice,
                viewingNumber, seoulSalesPrice, seoulViewingNumber, genreName, gradeName, movieSubdivisionName);
    }

    private int parseInteger(String s) {
        try {
            return Integer.parseInt(s.trim());
        } catch (NumberFormatException e) {

            return 0;
        }
    }

    private double parseDouble(String s) {
        try {
            return Double.parseDouble(s.trim());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }

    private static class movieCateList{

    }
    private static class MovieInfo {
        private int no;
        private String movieName;
        private String directorName;
        private String makerName;
        private String incomeCompanyName;
        private String distributionCompanyName;
        private String openingDate;
        private String movieTypeName;
        private String movieStyleName;
        private String nationalityName;
        private int totalScreenCount;
        private double salesPrice;
        private int viewingNumber;
        private double seoulSalesPrice;
        private int seoulViewingNumber;
        private String genreName;
        private String gradeName;
        private String movieSubdivisionName;

        public MovieInfo(int no, String movieName, String directorName, String makerName, String incomeCompanyName,
                         String distributionCompanyName, String openingDate, String movieTypeName, String movieStyleName,
                         String nationalityName, int totalScreenCount, double salesPrice, int viewingNumber,
                         double seoulSalesPrice, int seoulViewingNumber, String genreName, String gradeName,
                         String movieSubdivisionName) {

            this.no = no;
            this.movieName = movieName;
            this.directorName = directorName;
            this.makerName = makerName;
            this.incomeCompanyName = incomeCompanyName;
            this.distributionCompanyName = distributionCompanyName;
            this.openingDate = openingDate;
            this.movieTypeName = movieTypeName;
            this.movieStyleName = movieStyleName;
            this.nationalityName = nationalityName;
            this.totalScreenCount = totalScreenCount;
            this.salesPrice = salesPrice;
            this.viewingNumber = viewingNumber;
            this.seoulSalesPrice = seoulSalesPrice;
            this.seoulViewingNumber = seoulViewingNumber;
            this.genreName = genreName;
            this.gradeName = gradeName;
            this.movieSubdivisionName = movieSubdivisionName;
        }



        @Override
        public String toString() {
            return "MovieInfo{" +
                    "no=" + no +
                    ", movieName='" + movieName + '\'' +
                    ", directorName='" + directorName + '\'' +
                    ", makerName='" + makerName + '\'' +
                    ", incomeCompanyName='" + incomeCompanyName + '\'' +
                    ", distributionCompanyName='" + distributionCompanyName + '\'' +
                    ", openingDate='" + openingDate + '\'' +
                    ", movieTypeName='" + movieTypeName + '\'' +
                    ", movieStyleName='" + movieStyleName + '\'' +
                    ", nationalityName='" + nationalityName + '\'' +
                    ", totalScreenCount=" + totalScreenCount +
                    ", salesPrice=" + salesPrice +
                    ", viewingNumber=" + viewingNumber +
                    ", seoulSalesPrice=" + seoulSalesPrice +
                    ", seoulViewingNumber=" + seoulViewingNumber +
                    ", genreName='" + genreName + '\'' +
                    ", gradeName='" + gradeName + '\'' +
                    ", movieSubdivisionName='" + movieSubdivisionName + '\'' +
                    '}';
        }
    }
}