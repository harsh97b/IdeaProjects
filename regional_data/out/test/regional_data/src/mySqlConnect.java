import java.sql.Connection;
import java.sql.DriverManager;

public class mySqlConnect {
    public static Connection ConnectDb() {

        try {
            LoadDriver.loadDrivers();
//            Class.forName("com.mysql.cj.jdbc.Driver");
            String UID = "root";
            String PWD = "0000";
            String DB_URL = "jdbc:mysql://localhost:3306/regional_data?autoReconnect=true&useSSL=false";
            Connection conn = DriverManager.getConnection(DB_URL, UID, PWD);
                Connection conn1 = conn;
                return conn1;
        } catch (Exception e) {
            System.out.println("mysqlconnect       " + e);
            return null;
        }
    }
}

