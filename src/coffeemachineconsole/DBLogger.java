/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachineconsole;

/**
 *
 * @author moham
 */
import java.sql.*;
import java.util.logging.Level;

public class DBLogger implements Logger {

    private PreparedStatement stm;
    private final Connection con;

    DBLogger() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost/coffeemachine", "root", "");

    }

    @Override
    public void log(String coffeename, int water, int beans)throws ClassNotFoundException,SQLException {
    
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "insert into coffee (coffeename,water,beans)values(?,?,?)";
            stm = con.prepareStatement(sql);
            stm.setString(1, coffeename);
            stm.setInt(2, water);
            stm.setInt(3, beans);
            stm.executeUpdate();
            if (stm != null) {
                stm.close();
            }
       
    }

    public int CountCups() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT count(coffeename) AS cups FROM coffee ;";
        stm = con.prepareStatement(query);
        ResultSet resultSet = stm.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("cups");
        }
        return count;
    }
   

    public int Beans() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT beans AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        stm = con.prepareStatement(query);
        ResultSet resultSet = stm.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;
    }

    int Water() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT water AS maxx FROM coffee where id =(SELECT MAX(id) from coffee);";
        stm = con.prepareStatement(query);
        ResultSet resultSet = stm.executeQuery(query);
        int count = 0;
        while (resultSet.next()) {
            count = resultSet.getInt("maxx");
        }
        return count;}

}
