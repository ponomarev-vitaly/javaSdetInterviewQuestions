package exams;

import java.util.Scanner;

/**
 * Draw this figure:
 *
 */
//  *
//  * *
//  * * *
//  * * * *
public class InterviewQuestion36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = scan.nextInt();
        System.out.println();
        // Solution 1.
        for (int i = 0; i < rows; i++) {
            // System.out.println("* ");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Solution 2.
        System.out.println("* ");
        for (int i = 0; i < rows; i++) {
            System.out.print("* ");
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
