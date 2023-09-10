public class LocalInnerClass {
    /*
     * A class i.e., created inside a method, is called local inner class in java.
     * Local Inner Classes are the inner classes that are defined inside a block.
     * Generally, this block is a method body. Sometimes this block can be a for loop, or an if clause.
     * Local Inner classes are not a member of any enclosing classes.
     * They belong to the block they are defined within, due to which local inner classes cannot have any access modifiers associated with them.
     * However, they can be marked as final or abstract. These classes have access to the fields of the class enclosing it.
     *
     * Rules for Java Local Inner class: Local inner class cannot be invoked from outside the method.
     *
     * Local inner class có thể truy cập đến phạm vi của Class chứa nó (instance variable, instance method)
     * Local inner class có thể truy cập đến biến local được tạo ở cùng phạm vi method chứa nó
     * */

    // For example
    private final int data = 30;

    public void showData() {
        System.out.println("Data = " + data);
    }

    public void display() {
        int localVariable = 50;
        final class Local {
            public void msg() {
                System.out.println("Local varibale = " + localVariable);
                System.out.println("Data = " + data);
            }
        }
        Local ref = new Local();
        ref.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass tmp = new LocalInnerClass();
        tmp.showData();
        tmp.display();
    }
}
