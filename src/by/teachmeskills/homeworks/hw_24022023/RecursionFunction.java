package by.teachmeskills.homeworks.hw_24022023;

public class RecursionFunction {
    public static void main(String[] args) {
        System.out.println(recursionFunc(1, 10));
        System.out.println(recursionFunc(10, 1));
    }

    static String recursionFunc(int a, int b) {
        if (a < b) {
            return a + " " + recursionFunc(a + 1, b);
        } else if (a == b) {
            return Integer.toString(a);
        }
        return a + " " + recursionFunc(a - 1, b);
    }
}
