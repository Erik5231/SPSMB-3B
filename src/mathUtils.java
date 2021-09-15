public class mathUtils {
    public static int s(int a) {
        return a * a;
    }

    public static int v(int a) {
        return s(a) * a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sKruhu(int r) {
        return Math.PI * (r * r);
    }

    public static int factorial(int number) {
        int vysledek = 1;
        for (int i = number; i > 0; i--) {
            vysledek = vysledek * i;
        }
        return vysledek;
    }

    public static boolean even(int cislo) {
        return cislo % 2 == 0;
    }

    public static boolean primenumber(int pc) {
        for (int x = pc - 1; x > 1; x--) {
            if (pc % x == 0) {
                return false;
            }
        }
        return true;
    }
}