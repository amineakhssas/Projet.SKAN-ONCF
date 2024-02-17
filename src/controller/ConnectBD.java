package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectBD {


    private static ConnectBD instance = null;
    private static Connection conn = null;

    public static Connection getIntance() throws SQLException {
        if (instance != null && !instance.getConnection().isClosed()) {
            return (Connection) instance;
        } else {
            instance = new ConnectBD();
        }
        return conn;
    }

    public ConnectBD() {
        try {
            init();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    private void init() throws SQLException {

        final String DB_URL = "jdbc:mysql://localhost:3306/trajets?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final String USER = "root";
        final String PASS = "";
        conn = DriverManager.getConnection(DB_URL, USER, PASS);

        System.out.println("Connected to database");
         
    }

    public Connection getConnection() {
        return conn;
    }


}
