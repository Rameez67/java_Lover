// 21. Write a Java program to display the pattern like a diamond.

// Test Data
// Input number of rows (half of the diamond) : 7
// Expected Output :

                                                                                 
//       *                                                                          
//      ***                                                                         
//     *****                                                                        
//    *******                                                                       
//   *********                                                                      
//  ***********                                                                     
// *************                                                                    
//  ***********                                                                     
//   *********                                                                      
//    *******                                                                       
//     *****                                                                        
//      ***                                                                         
//       *           

import java.util.Scanner;


public class patternDiamond {
    public static void main(String[] args) {
        System.out.println("Printing the patterns like diamond: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Give the user input");
        int input =in.nextInt();
       
        for (int i = 1; i <=input; i++) {

           for (int j = 1; j <=input-i; j++) {
            System.out.print(" ");
           }
            for (int j = 1; j <=2*i-1; j++) {

                System.out.print("*");
               

            }
            System.out.println();
           

            

        }

        for (int i = input; i >=0; i--) {

            for (int j = 1; j <=input-i; j++) {
             System.out.print(" ");
            }
             for (int j = 1; j <=2*i-1; j++) {
 
                 System.out.print("*");
                
 
             }
             System.out.println();
            
 
             
 
         }
        
    }
}
