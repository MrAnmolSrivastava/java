import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        // Upper half
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print(Math.max(j, i));
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(Math.max(i, j));
            }
            System.out.println();
        }
        // Lower half
        for (int i = 2; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(Math.max(i, j));
            }
            for (int j = 2; j <= n; j++) {
                System.out.print(Math.max(i, j));
            }
            System.out.println();
        }
    }
}