// 24. Write a Java program to generate the following @'s triangle.

// Test Data
// Input the number: 6
// Expected Output :

//       @                                                  
//      @@                                                  
//     @@@                                                  
//    @@@@                                                  
//   @@@@@                                                  
//  @@@@@@
import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        System.out.println("Printing the trianlge of @: ");
        Scanner in =new Scanner(System.in);
        System.out.println("Take the input from user: ");
        int row = in.nextInt();
        for (int i = 0; i <=row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
