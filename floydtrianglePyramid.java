import java.util.Scanner;

public class floydtrianglePyramid {
    public static void main(String[] args) {
        int numbers =1;
        System.out.println("Print the Floyds Triangle pyramid: ");
        Scanner in = new Scanner(System.in);
        System.out.print("User give the inputs: ");
        int num = in.nextInt();
        int space = num + 5-1;
        for (int i = 1; i <= num; i++) {
            for(int x=space; x!=0; x--){
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println();
            space--;
        }
    }
}
