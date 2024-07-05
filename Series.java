import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Print the series for the current query
            printSeries(a, b, n);
        }
        
        scanner.close();
    }
    
    // Function to print the series for a single query
    private static void printSeries(int a, int b, int n) {
        int sum = a; // Initialize sum with the first term 'a'
        
        // Print each term of the series
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2, i) * b; // Update sum based on the series formula
            System.out.print(sum + " "); // Print the current term
        }
        
        System.out.println(); // Move to the next line after printing the series
    }
}
