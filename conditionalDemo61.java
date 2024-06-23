import java.util.Scanner;

public class conditionalDemo61 {
    // Write a Java program that reads two floating-point numbers and tests whether 
    // they are the same up to three decimal places.
    public static void main(String[] args) {
        System.out.println("Three Decimal number : ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the floating number have 3 decimal digits");
        float x = in.nextFloat();
        System.out.println("Enter another number ");
        float y = in.nextFloat();
        y= Math.round(y*1000);
        y = y/1000;
        x = Math.round(x *1000);
        x = x/1000;
        if (x==y) {
            System.out.println("they have same decimal places");
            
        }
        else{
            System.out.println("dont have same place");
        }
    }
}
