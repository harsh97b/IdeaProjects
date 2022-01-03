import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchFinalResult {
    public static void fetch() throws SQLException {
        int size = ReadInputs.noOfLines;
        Connection conn = MySqlConnect.ConnectDb();
        Statement stmt  = conn.createStatement();
        String sql = "select region, country, round(sum(res),2) as result from data group by region, country;";
        ResultSet rs = stmt.executeQuery(sql);
        String userData = null;
        while(rs.next()){
            try {
                userData = rs.getString(1)+ "  |  " +rs.getString(2)+"  |  " +rs.getDouble(3);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(userData);
        }
    }
}
