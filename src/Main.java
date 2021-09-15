import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //nactete koeficienty abc, vypoctete diskriminant
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš 3 čísla: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        calculate(a, b, c);
    }

    public static void calculate(int a, int b, int c) {
        double diskriminant = (b * b) - 4 * a * c;
        System.out.println("Diskriminant: " + diskriminant);

        if (diskriminant >= 0) {
            double x1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        } else {
            System.out.println("Nemá řešení.");
        }
    }
}