import java.io.IOException;

public class Home {
    public static void main(String args[]) throws IOException {
        String expr = null;
        expr = "a1+a2+a3+a4";
        ReadInputs.readInputs();
        EvalExpression.start(expr);
    }
}
