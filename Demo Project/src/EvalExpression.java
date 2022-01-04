import java.sql.SQLException;
import java.util.Arrays;

public class EvalExpression {
    public static double[] result;
    public static void start(String expr){
//        String expr = "a1*a2+a3/a4";

        if(expr == null)
                expr = "a1+a2+a3+a4";
        try {
            evalExpr(expr, ReadInputs.arr1, ReadInputs.arr2, ReadInputs.arr3, ReadInputs.arr4, ReadInputs.region,  ReadInputs.country);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void evalExpr(String expr, double[] arr1, double[] arr2, double[] arr3, double[] arr4, String[] region, String[] country) throws SQLException {
        int size = ReadInputs.noOfLines;
        result = new double[size];
        for(int i=0 ; i<size ; i++){
            result[i] = Evaluate.evalString(expr, arr1[i], arr2[i], arr3[i], arr4[i]);
        }
        System.out.println("     "+ Arrays.toString(result));
        StoreResultToDatabase.storeResult();
        FetchFinalResult.fetch();

    }
}
