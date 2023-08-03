public class Main {
    private static Context context;

    public static void main(String[] args) {
        context = new Context();
        int a = 10;
        int b = 5;
        performOperation(a, b, "+");
        performOperation(a, b, "-");
        performOperation(a, b, "*");

    }

    public static void performOperation(int a, int b, String operation) {
        switch (operation) {
            case "+" -> context.setStrategy(
                    new StrategyAdd()
            );
            case "-" -> context.setStrategy(
                    new StrategySub()
            );
            case "*" -> context.setStrategy(
                    new StrategyMul()
            );
        }
        // For simplicity, if operation not performed it will case error
        System.out.println(a + operation + b + "=" + context.executeStrategy(a, b));
    }
}