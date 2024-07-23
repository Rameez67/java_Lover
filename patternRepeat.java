// 17. Write a program in Java to make such a pattern like a right angle triangle with a number which repeats a number in a row.

// The pattern is as follows :

// 1
// 22
// 333
// 4444

import java.util.Scanner;

public class patternRepeat {
    public static void main(String[] args) {
        System.out.println("printing the number in loops that repeats ");
        Scanner in = new Scanner(System.in);
        System.out.println("give the user input");
        int endNum = in.nextInt();
        for (int i = 1; i <=endNum; i++) {
            System.out.println(" ");
            for (int j = 1; j <=i ; j++) {
                System.out.print(i);
            }
        }
    }
}
