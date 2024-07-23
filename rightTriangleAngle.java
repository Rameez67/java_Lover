// 16. Write a Java program to display the pattern like a right angle triangle with a number.

// Test Data
// Input number of rows : 10

import java.util.Scanner;

public class rightTriangleAngle {
    public static void main(String[] args) {
        System.out.println("Print the right triangle angle: ");
        Scanner in = new Scanner(System.in);
        System.out.println("user should give input: ");
        int endNum = in.nextInt();
        for (int i = 1; i <=endNum; i++) {
            System.out.println(" ");
            for (int j = 0; j <=i; j++) {
                System.out.print(j);
            }
        }
    }
}
