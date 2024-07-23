
// 14. Write a Java program to display the multiplication table of a given integer.

// Test Data
// Input the number (Table to be calculated) : Input number of terms : 5
import java.util.Scanner;

public class table5 {
    public static void main(String[] args) {
        System.out.println("Printing the  table ");
        Scanner in =new Scanner(System.in);
        System.out.print("Now give the table you want to print:\n ");
        int tableNum=in.nextInt();
        System.out.print("Give the limit where you want to start table:\n");
        int start = in.nextInt();
        System.out.print("Give the limit where you want to end table:\n");
        int end = in.nextInt();
        for (int i = start; i <= end; i++) {
            System.out.println(i +" x "+tableNum+" = "+i*tableNum);
        }
        System.out.println("You worked done totally thanks ");

    }
}
