public class Calculette {
    public static void main (String[] args) {
        // No arguments
        if (args.length == 0) {
            System.out.println("Usage: java Calculette <value1> <operator> <value2>");
            System.out.println("Usage: java Calculette <value1> <operator> <value2> <operator> <value3> ...");
            System.exit(1);
        }

        // Calculette with multiple arguments
        if (args.length > 3 && args.length % 2 == 1) {
            System.out.println("Complex calculette");
            complexCalculette(args);
            System.exit(0);
        }

        // Calculette with 2 arguments
        else {
            System.out.println("Simple calculette");
            simpleCalculette(args);
            System.exit(0);
        }
    }

    public static void complexCalculette(String[] args) {
        double res = Double.parseDouble(args[0]);
        for (int i = 1; i < args.length; i = i + 2) {
            char operator = args[i].charAt(0);
            double right = Double.parseDouble(args[i + 1]);
            res = compute(res, operator, right);
        }

        res = Math.round(res * 100.0) / 100.0;
        System.out.println("Value = " + res);
    }

    public static void simpleCalculette(String[] args) {
        double left = Double.parseDouble(args[0]);
        char operator = args[1].charAt(0);
        double right = Double.parseDouble(args[2]);
        double res = compute(left, operator, right);
        System.out.println("Value = " + res);
    }

    public static double compute(double left, char operator, double right) {
        return switch (operator) {
            case '+' -> left + right;
            case '-' -> left - right;
            case '*' -> left * right;
            case '/' -> left / right;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }
}


