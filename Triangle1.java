// 23. Write a Java program to generate the following * triangles.

// Test Data
// Input the number: 6
// Expected Output :

// ******                                                   
//  *****                                                   
//   ****                                                   
//    ***                                                   
//     **                                                   
//      * 

import java.util.Scanner;

public class Triangle1 {
    public static void main(String[] args) {
        System.out.println("Printing the different patterns: ");
        Scanner in= new Scanner(System.in);
        System.out.print("User should give the inputs, ");
        int row =in.nextInt();
        for (int i = row; i >0; i--) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
