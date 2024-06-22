// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class conditionDemo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Take input From user");
        int input = in.nextInt();
        if (input >0) {
            System.out.println("The number is positive :"+input);
        }
        else if(input<0){
            System.out.println(" The number is negative :"+input);
        }
        else{
            System.out.println("The input is zero :"+input);
        }
    }
}
