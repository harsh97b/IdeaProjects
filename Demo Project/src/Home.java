import java.io.IOException;

public class Home {
    public static void main(String args[]) throws IOException {
        System.out.println("here in main");
        ReadInputs.readInputs();
//        ReadInputs.read();
//        Evaluate.evalExp();
        EvalExpression.start();
    }
}
