package by.teachmeskills.homeworks.hw_24022023;

public class ExactPowerTwo {
    public static void main(String[] args) {
        int N = 32;
        System.out.println(recursion(N) == 1 ? "Yes" : "No");
    }

    static double recursion(double n) {
        if (n == 1) {
            return 1;
        } else if (n > 1 && n < 2) {
            return 0;
        } else {
            return recursion(n / 2);
        }
    }
}
