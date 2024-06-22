import java.util.Scanner;

public class conditionDemo41 {
    public static void main(String[] args) {
        System.out.println("Take 3 inputs from user ");
         Scanner in = new Scanner(System.in);
        System.out.println("take 3 input from user");
        int a = in.nextInt();
        System.out.println("1st number "+a);
        int b = in.nextInt();
        System.out.println("2nd number "+b);
        int c = in.nextInt();
        System.out.println("3rd number "+c);
        if(a>b && a>c){
            System.out.println("a is greater  "+a);
        }
        else if(b>a && b>c){
            System.out.println("b is greater  "+b);
        }
       else{
        System.out.println("c is greater "+c);
       }
    }
}
