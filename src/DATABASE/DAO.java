/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATABASE;

import MODEL.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class DAO {
    private static ResultSet rs;
    private static Connection con;
    static Logger logger = Logger.getLogger(DAO.class.getName());

    public static void getRemoteConnection() throws SQLException {
        try {
            
            String dbName = "IWISH";
            String hostname = "iwishinstance.cfhjtwlnrpbz.us-east-1.rds.amazonaws.com";
            String port = "1521";
            String jdbcUrl = "jdbc:oracle:thin:@" + hostname + ":" + port + ":" + dbName;
            
            con = DriverManager.getConnection(jdbcUrl, "serry", "ahmedserry");
            logger.info("Remote connection successful.");
            System.out.println("Remote connection successful.");
            
        
        } catch (SQLException e) {
            System.out.println("Error syntax");
            System.out.println(e.toString());
        }
    }

    public static int insertUser(User user) throws SQLException {
        DAO.getRemoteConnection();
        int result = -1;
        PreparedStatement pst = con.prepareStatement("insert into Clients values (USER_ID_SEQ.nextval,?,?,?)", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

        pst.setString(1, "Mayar");
        pst.setString(2, "Mayar@gmail.com");
        pst.setString(3, "Mayar123");
        result = pst.executeUpdate();
        if (result == -1) {
            System.out.println("Failed");
        } else {
            System.out.println("Successful");
        }
        pst = con.prepareStatement("select * from Clients", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = pst.executeQuery();
        return result;

    }
    
    public static String selectFromTab() throws SQLException {
        getRemoteConnection();
        String result = null;
        PreparedStatement pst = con.prepareStatement("select * from tab", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        rs = pst.executeQuery();

        if (rs.next()) {
            result = rs.getString("TNAME");
            System.out.print(result);

        } else {
            System.out.print("no data found ");
        }

        return result;
    }
}
