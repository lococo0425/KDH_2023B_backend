package Project_solo.SoloProject.model.dao;


import Project_solo.SoloProject.CSV.CSVReader;
import Project_solo.SoloProject.model.dto.Ps_MovieDto;

import java.sql.PreparedStatement;
import java.util.List;

public class Ps_MovieDao extends PsDao{

    private Ps_MovieDao(){}
    private static Ps_MovieDao psMovieDao = new Ps_MovieDao();
    public static Ps_MovieDao getInstance(){return psMovieDao;}

    public String printMovie(Ps_MovieDto psMovieDto){
        String result = "";
        try{
            result = "INSERT INTO movies (movie_id, movie_title, director, producer, income_company, " +
                    "distribution_company, release_date, movie_type, movie_style, nationality, total_screen_count, " +
                    "sales_price, viewing_number, seoul_sales_price, seoul_viewing_number, genre, grade, movie_subdivision) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            System.out.println("result = " + result);


            try(PreparedStatement preparedStatement = connection.prepareStatement(result)) {
                preparedStatement.setString(1, psMovieDto.getMovieId().toString());
                preparedStatement.setString(2, psMovieDto.getMovieName());
                preparedStatement.setString(3, psMovieDto.getDirectorName());
                preparedStatement.setString(4, psMovieDto.getMakerName());
                preparedStatement.setString(5, psMovieDto.getIncomeCompanyName());
                preparedStatement.setString(6, psMovieDto.getDistributionCompanyName());
                preparedStatement.setString(7, psMovieDto.getOpeningDate());
                preparedStatement.setString(8, psMovieDto.getMovieTypeName());
                preparedStatement.setString(9, psMovieDto.getMovieStyleName());
                preparedStatement.setString(10, psMovieDto.getNationalityName());
                preparedStatement.setInt(11, psMovieDto.getTotalScreenCount());
                preparedStatement.setDouble(12, psMovieDto.getSalesPrice());
                preparedStatement.setInt(13, psMovieDto.getViewingNumber());
                preparedStatement.setDouble(14, psMovieDto.getSeoulSalesPrice());
                preparedStatement.setInt(15, psMovieDto.getSeoulViewingNumber());
                preparedStatement.setString(16, psMovieDto.getGenreName());
                preparedStatement.setString(17, psMovieDto.getGradeName());
                preparedStatement.setString(18, psMovieDto.getMovieSubdivisionName());

                preparedStatement.executeUpdate();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
     return result;
    }


    public String selectGerne(Ps_MovieDto psMovieDto){
        String result = "";
        try{
            String sql = "select genre from movies";
            preparedStatement=connection.prepareStatement(sql);
            resultSet=preparedStatement.executeQuery();

            String sql2 = "insert into logs(selectge) values (?)";
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.setString(1,psMovieDto.getGenreName());
            if(resultSet.next()){
                return sql;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
