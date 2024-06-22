public class conditionalDemo2 {
    public static void main(String[] args) {

        // This operator is also known as the ternary operator because it uses three
        // operands.
        int value1 = 1;
        int value2 = 2;
        boolean somecondition = true;
        int result = somecondition ? value1 : value2;
        System.out.println("Result " + result);
    }
}
