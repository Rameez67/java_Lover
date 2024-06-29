package loopsPatterns;

public class loopDemo2 {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t<== patterns practicing ==>");
        for(int i=10; i>0; i--){
            System.out.println();                               //$$$$$$$$$
            for(int j=1; j<i; j++){                             // $$$$$$$
                System.out.print("$");                        //  $$$$$
            }                                                   //   $$$
        }                                                       //    $
    }
}
