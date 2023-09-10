public class NestedInterface {
    /*
     * An interface, i.e., declared within another interface or class, is known as a nested interface.
     * The nested interfaces are used to group related interfaces so that they can be easy to maintain.
     * The nested interface must be referred to by the outer interface or class. It can't be accessed directly.
     *
     * Points to remember for nested interfaces:
     * 1. The nested interface must be public if it is declared inside the interface,
     * but it can have any access modifier if declared within the class.
     * 2. Nested interfaces are declared static
     *
     * */

    // Ex: Example of nested interface which is declared within the interface
    public interface Showable {
        void show();

        interface Message {
            void msg();
        }
    }

    public class TestNestedInterface1 implements Showable.Message {
        @Override
        public void msg() {
            System.out.println("Hello, Nested interface inside outer interface");
        }

        public void use() {
            Showable.Message message = new TestNestedInterface1();
            message.msg();
        }
    }

    // Ex: Example of nested interface which is declared within the class
    public class A {
        public interface Portable {
            void msg();
        }
    }

    public class TestNestedInterface2 implements A.Portable {
        @Override
        public void msg() {
            System.out.println("Hello, Nested interface inside outer class");
        }

        public void use() {
            A.Portable ref = new TestNestedInterface2();
            ref.msg();
        }
    }
}
