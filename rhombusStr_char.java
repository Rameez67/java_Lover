// 26. Write a Java program to display the following character rhombus structure.

// Test Data
// Input the number: 7
// Expected Output :

                                      
//       A                                                  
//      ABA                                                 
//     ABCBA                                                
//    ABCDCBA                                               
//   ABCDEDCBA                                              
//  ABCDEFEDCBA                                             
// ABCDEFGFEDCBA                                            
//  ABCDEFEDCBA                                             
//   ABCDEDCBA                                              
//    ABCDCBA                                               
//     ABCBA                                                
//      ABA                                                 
//       A  

import java.util.Scanner;

public class rhombusStr_char {

    public static void main(String[] args) {
        int count =1;
        int no_of_spaces =1;
        char c = 'A';
        System.out.println("Printing the rhombus structure of the characters: ");
        Scanner in = new Scanner(System.in);
        System.out.print("Take the input from user: ");
        int row = in.nextInt();
        for (int i = 1; i <row*2; i++) {
            for (int j = row-no_of_spaces; j > 0 ; j--) {
                System.out.print(" ");
            }
            if (i<row) {
                no_of_spaces++;
            }
            else{
                no_of_spaces--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(c);
                if (j<count/2) {
                    c++;
                }
                else{
                    c--;
                }
            }
            if (i<row) {
                count =count+2;
            }
            else{
                count =count-2;
            }
            c='A';
            System.out.println();
        }
    }
}