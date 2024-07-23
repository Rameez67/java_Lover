// 18. Write a Java program to make such a pattern like a right angle triangle with the number increased by 1

import java.util.Scanner;

public class patternIncrease {
    public static void main(String[] args) {
        System.out.println("Printing the pattern that increase by 1: ");
        Scanner in =new Scanner(System.in);
        System.out.print("User shoukd give the input:");
        int patternLimit =in.nextInt();
        for (int i = 1; i <=patternLimit; i++) {
            System.out.println(" ");
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
        }
    }
}
