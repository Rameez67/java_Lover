// 25. Write a Java program to display the number rhombus structure.

// Test Data
// Input the number: 7
// Expected Output :
//       1                                                  
//      212                                                 
//     32123                                                
//    4321234                                               
//   543212345                                              
//  65432123456                                             
// 7654321234567                                            
//  65432123456                                             
//   543212345                                              
//    4321234                                               
//     32123                                                
//      212                                                 
//       1   

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        int count =1;
        int no_of_spaces = 1;
        int start = 0;
        System.out.println("Printing the rhombus structure : ");
        Scanner in = new Scanner(System.in);
        System.out.println("input user: ");
        int row = in.nextInt();
        for (int i = 1; i <row*2; i++) {
            for (int j =row - no_of_spaces; j >0; j--) {
                System.out.print(" ");
                
            }

            if (i<row) {
                start =i;
                no_of_spaces++;
            }
            else{
                start = row*2-i;
                no_of_spaces--;
            }
            for (int j = 0; j <count; j++) {
                System.out.print(start);
                if (j<count/2) {
                    start--;
                }
                else{
                    start++;
                }
            }
            if (i<row) {
                count = count+2;
            }
            else{
                count =count-2;
            }
            System.out.println();
        }

    }
}
