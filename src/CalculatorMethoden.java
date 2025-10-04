public class CalculatorMethoden {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        String methodName = "Addition";

        int result = add(a,b);
        System.out.println("Methode" + methodName);
        System.out.println("Wert 1: " + a);
        System.out.println("Wert 2: " + b);
        System.out.println("Resultat: " + result);


    }

    public static void printresult(int a, int b, int result, String methodName) {

    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static double div(int a, int b) {
        return a / (b * 1.0);
    }

}