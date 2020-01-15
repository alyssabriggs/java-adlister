package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;
import models.Ad;
import models.Ads;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class MySQLAdsDao implements Ads {

    // initialize the private connection
    private Connection connection;

    //constructor
    public MySQLAdsDao() throws SQLException {

        //surround in a try catch
        try {
            //
            Config config = new Config();
            // register the driver & make sure you import the right driver class
            DriverManager.registerDriver(new Driver());
            // use driver manager to get connection
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    @Override
    //retrieve ads from the database
    public List<Ad> all() {

        // create a new list to return from the method - as we pull out from JDBC we put into this array list of ads
        List<Ad> output = new ArrayList<>();

        //Query to send to the JDBC
        String query = "SELECT * FROM ads";

        try {
            //creating a statement object through the connection object
            Statement st = connection.createStatement();
            // create a result set of the results from our query and pass it our query
            ResultSet rs = st.executeQuery((query));

            //going through the result set and creating an ad from each output item
            while (rs.next()) {
                output.add(new Ad(
                        //using getLong because that is the data type of the ID vice versa for getString
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return output;
    }

    //insert ads into the interface
    @Override
    public Long insert(Ad ad) {

        Long lastInsertedId = 0L;

        String query = String.format(
                "INSERT INTO ads (user_id, title, description) VALUES(%d, '%s', '%s')",
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription()
        );

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                lastInsertedId = rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lastInsertedId;
    }
}

//    public static void main(String[] args) throws SQLException {
//
//        //testing ALL method
////        Ads adsDao = new MySQLAdsDao();
////        List<Ad> ads = adsDao.all();
////        for (Ad ad : ads){
////            System.out.println(ad);
////        }
//
//        //testing INSERT method
//        Ad adToInsert = new Ad (
//                1,
//                "Test Ad Insert 1",
//                "This is the first test ad"
//        );
//
//        Ads adsDao = new MySQLAdsDao();
//        long lastInsertedID = adsDao.insert(adToInsert);
//        System.out.println(lastInsertedID);
//
//        List<Ad> ads = adsDao.all();
//        for (Ad ad : ads){
//            System.out.println(ad);
//        }
//    }
//}
