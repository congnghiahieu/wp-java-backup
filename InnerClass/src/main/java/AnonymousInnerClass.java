public class AnonymousInnerClass {
    /*
     * Java anonymous inner class is an inner class without a name and for which only a single object is created.
     * An anonymous inner class can be useful when making an instance of an object with certain "extras"
     * such as overloading or override methods of a class or interface, without having to actually subclass a class.
     *
     * In simple words, a class that has no name is known as an anonymous inner class in Java.
     * It should be used if you have to override a method of class or interface.
     * Java Anonymous inner class can be created in two ways
     * 1. Class (may be Abstract or Concrete)
     * 2. Interface
     * */

    /*
     * Cách thức hoạt động của anonymous class
     * 1. A class is created, but its name is decided by the compiler,
     * which implements the Eatable interface (Animal abstract class) and provides the implementation of the eat()
     * method (sleep() method).
     * 2. An object of the Anonymous class is created that is referred to by 'tmp' ('ref'), a reference variable of the
     * Eatable (Animal)
     *  type.
     * */


    public static void main(String[] args) {
        Animal ref = new Animal() {
            @Override
            void sleep() {
                System.out.println("Hello World");
            }
        };

        Eatable tmp = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Bark Bark");
            }
        };
        ref.sleep();
        tmp.eat();
    }

    // For example: anonymous class implement eat() method from an interface
    interface Eatable {
        void eat();
    }

    // For example: anonymous class implement sleep() method from abstract class Animal
    private static abstract class Animal {
        abstract void sleep();
    }
}
