package Function;

public class LambdaExprExample {
    public static void main(String[] args) {

        MyFuncinterface declaredLambdaExpression = (n) -> {
            System.out.println("Received : " + n);
            return n * 2;
        };
        System.out.println(declaredLambdaExpression.doubleValue(10));
    }
}
