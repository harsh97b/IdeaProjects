import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class evaluate {


    public static void evalExp(){
        Connection conn = mySqlConnect.ConnectDb();

        String query="insert into data(arr1,arr2,arr3,arr4,region,country) values(?,?,?,?,?,?)";

        PreparedStatement pst;

        {
            try {
                assert conn != null;
//                if(conn!=null)
//                    System.out.println("conn is not null "+conn);
                pst = conn.prepareStatement(query);
                pst.setDouble(1,21.0);
                pst.setDouble(2,22.0);
                pst.setDouble(3,23.0);
                pst.setDouble(4,24.0);
                pst.setString(5,"asia");
                pst.setString(6,"india");
                pst.execute();
                pst.close();
                System.out.println("here in try");
            } catch (SQLException e) {
                System.out.println("here in catch");
                e.printStackTrace();
            }
        }
//        pst.setInt(1,1);

    }
}
