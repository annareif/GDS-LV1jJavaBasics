public class CalculatorMethoden {

    public static void main(String[] args) {
        int a = 4;
        int b = 3;

        int result = add(a, b);
        System.out.println("Input 1 = " + a);
        System.out.println("Input 2 = " + b);
        System.out.println("Result = " + result );


    }

    public static void printResult(int a, int b, int result) {
        System.out.println("Input 1 = " + a);
        System.out.println("Input 2 = " + b);
        System.out.println("Result = " + result );
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static double divide (int a, int b) {
        if (b != 0) {
            return a / (b * 1.0);
        } else {
            return 0;
        }


    }}

