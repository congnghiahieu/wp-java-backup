public class StaticNestedClass {
    /*
     * A static class is a class that is created inside a class, is called a static nested class in Java.
     * It cannot access non-static data members and methods. It can be accessed by outer class name.
     * It can access static data members of the outer class, including private.
     * The static nested class cannot access non-static (instance) data members
     * */

    public static int data = 30;

    private static class Inner {
        public void msg() {
            System.out.println("Data = " + data);
        }

        // If you have the static member inside the static nested class,
        // you don't need to create an instance of the static nested class.
        public static void show() {
            System.out.println("Hello, World");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Inner nestedClass = new StaticNestedClass.Inner();
        nestedClass.msg();
        StaticNestedClass.Inner.show(); // no need to create an instance
    }
}
