// 22. Write a Java program to display Pascal's triangle.

// Test Data
// Input number of rows: 5
// Expected Output :

// Input number of rows: 5                                                          
//       1                                                                          
//      1 1                                                                         
//     1 2 1                                                                        
//    1 3 3 1                                                                       
//   1 4 6 4 1          
import java.util.Scanner;

public class pascalsTriangle {
    public static void main(String[] args) {
        int c=1;
        System.out.print("The pascals Trianlgle Patterns: Give the inputs for Rrows, ");
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int i = 0; i <row; i++) {
            for (int j = 1; j <=row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                if(j==0 || i==0)
                    c=1;
                
                
                else
                    c= c*(i-j+1)/j;
                    System.out.print(" "+c);
                
            }
            System.out.println();
        }

    }
}
