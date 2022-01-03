import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StoreResultToDatabase {
    public static void storeResult(){
        int size = ReadInputs.noOfLines;
        Connection conn = MySqlConnect.ConnectDb();
//        System.out.println("here in storeResult"+ ReadInputs.arr1[0]);
        String query="insert into data(arr1,arr2,arr3,arr4,region,country,res) values(?,?,?,?,?,?,?)";
        PreparedStatement pst;
        try {
            assert conn != null;
//                if(conn!=null)
//                    System.out.println("conn is not null "+conn);
            for( int i=0 ; i<size ; i++){
                pst = conn.prepareStatement(query);
                pst.setDouble(1,ReadInputs.arr1[i]);
                pst.setDouble(2,ReadInputs.arr2[i]);
                pst.setDouble(3,ReadInputs.arr3[i]);
                pst.setDouble(4,ReadInputs.arr4[i]);
                pst.setString(5,ReadInputs.region[i]);
                pst.setString(6,ReadInputs.country[i]);
                pst.setDouble(7,EvalExpression.result[i]);
                pst.execute();
                pst.close();
            }

            System.out.println("here in try of storeResult");
        } catch (SQLException e) {
            System.out.println("here in catch of storeResult");
            e.printStackTrace();
        }
    }
}
