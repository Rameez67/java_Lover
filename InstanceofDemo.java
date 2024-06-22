public class InstanceofDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new child();
        
        System.out.println("objj1 is instanceof parent "+(obj1 instanceof Parent));
        System.out.println("obj1 is instanceof child "+(obj1 instanceof child));
        System.out.println("obj1 is instaceof MyInterface "+(obj1 instanceof MyInterface));
        System.out.println("obj2 is instanceof parent "+(obj2 instanceof Parent));
        System.out.println("obj2 is instanceof child "+(obj2 instanceof child));
        System.out.println("obj2 is instanceof MyInterface "+(obj2 instanceof MyInterface));

    }
}
class Parent{}
class child extends Parent implements MyInterface{}
interface MyInterface{}