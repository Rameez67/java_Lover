// 15. Write a Java program that displays the sum of n odd natural numbers.

// Test Data
// Input number of terms is: 5

import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        int oddSum = 0;
        int evenSum =0;
        System.out.println("Printing the odd numbers ");
        Scanner in = new Scanner(System.in);
        System.out.println("user should give input ");
        int naturalNum= in.nextInt();
        for (int i = 1; i <= naturalNum ; i++) {
            if (i % 2 !=0) {
               oddSum +=i;
            }
            else{
                evenSum +=i;
            }
        }
        System.out.println("The sum of all Odd Number are: "+oddSum);
    }
}
