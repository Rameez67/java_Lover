// 25. Write a Java program to display the number rhombus structure.

// Test Data
// Input the number: 7
// Expected Output :

                                   
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6 7
// 1 2 3 4 5 6
// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
//  1
import java.util.Scanner;

public class rhombusStr {
    public static void main(String[] args) {
        System.out.println("Printing the rhombus Structure: ");
        Scanner in =new Scanner(System.in);
        System.out.println("Take input from user: ");
        int row = in.nextInt();
        for (int i = 0; i <=row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);

            }
            System.out.println();
        }
        
        for (int i = row; i >=0; i--) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);

            }
            System.out.println();
        }
    }
}
