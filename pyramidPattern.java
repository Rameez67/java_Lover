// 19. Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.

//        1
//       2 2
//      3 3 3
//     4 4 4 4 

public class pyramidPattern {
    public static void main(String[] args) {
        System.out.println("Printing the pyramid ");
        int num = 5;
        int s = num+4-1;
        for (int i = 1; i <= num; i++) {
            for (int x = s; x !=0; x--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i;  j++) {
                System.out.print(i+" ");
                
            }
            System.out.println();
            s--;
        }
    }
}
