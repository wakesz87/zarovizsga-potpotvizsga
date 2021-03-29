//Hozd létre a HouseCup osztályt, ami konstruktor paraméterben megkapja az adatbázis eléréshez szükséges DataSource példányt.
//getPointsOfHouse(String houdse): adja vissza, hogy a paraméterként megadott ház mennyi pontot szerzett
package hu.nive.ujratervezes.zarovizsga.housecup;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

public class HouseCup {

    private DataSource dataSource;

    public HouseCup(DataSource dataSource){
        this.dataSource = dataSource;
    }

    public int getPointsOfHouse(String houdse){

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement preparedStatement = conn.prepareStatement("SELECT `points_earned` FROM `house_points` WHERE `house_name` =?;")){
            preparedStatement.setString(1, houdse);
            return getResultSetByStatement (preparedStatement);
        }catch (SQLException sqle){
            throw new IllegalStateException("error not connect", sqle);
        }



    }

    private int getResultSetByStatement(PreparedStatement preparedStatement) {
        int counts = 0;
        try(ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                counts += resultSet.getInt("points_earned");
            }
            return counts;
        }catch (SQLException sqle){
            throw new IllegalStateException("error select", sqle);
        }

    }


}
