package loopsPatterns;

public class loopDemo1 {
    public static void main(String[] args) {
        System.out.println("print the pattern ");
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for(int j=0; j<i; j++)
            System.out.print("@\t");
        }
        
    }
}
