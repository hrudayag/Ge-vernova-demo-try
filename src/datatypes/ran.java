package datatypes;

import java.util.Scanner;
import java.util.Random;

public class ran{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Input: number of flips
        System.out.print("Enter number of times to flip the coin: ");
        int n = sc.nextInt();

        // Ensure positive integer
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int heads = 0;
        int tails = 0;

        // Flip the coin n times
        for (int i = 0; i < n; i++) {
            double result = random.nextDouble(); // value between 0.0 and 1.0

            if (result < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        // Calculate percentages
        double headPercentage = (heads * 100.0) / n;
        double tailPercentage = (tails * 100.0) / n;

        // Output
        System.out.println("Heads Percentage: " + headPercentage + "%");
        System.out.println("Tails Percentage: " + tailPercentage + "%");

        sc.close();
    }
}
