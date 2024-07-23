// 20. Write a Java program to print Floyd's Triangle.

// Test Data
// Input number of rows : 5
// Expected Output :

// Input number of rows :  5
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String[] args) {
        int number =1;
        System.out.println("Printing the Floyds triangle: ");
        
        Scanner in = new Scanner(System.in);
        System.out.print("User input the number of rows: ");
        int input =in.nextInt();
        for(int i=1; i<=input; i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
