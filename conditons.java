import java.util.Scanner;

public class conditons {
    public static void main(String[] args) {
        System.out.println("Printing the vowels or consonanat");
        Scanner in =new Scanner(System.in);
        String input = in.nextLine();
        if ( (input.equals("a") && input.equals("e") && input.equals("i") && input.equals("o") && 
        input.equals("u")) || (input.equals("A") &&input.equals("E") &&input.equals("I") && input.equals("O") &&
        input.equals("U") ) )  {
            System.out.println("This is vowel: "+input);
        }
        else{
            System.out.println("This is Consonant: "+input);
        }
    }
}
