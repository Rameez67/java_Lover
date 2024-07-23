
// Write a Java program to display the cube of the given number up to an integer.

// Test Data
// Input number of terms : 4

import java.util.Scanner;

public class displayIn {
    public static void main(String[] args) {
        
        System.out.println("Display the integers using loop");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
             System.out.println("Cube of the given numbers is: "+i*i*i);
        }
       
    }

}
