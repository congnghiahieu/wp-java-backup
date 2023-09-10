public class MemberInnerClass {
    /*
     * A non-static class that is created inside a class but outside a method is called member inner class.
     * It is also known as a regular inner class.
     * It can be declared with access modifiers like public, default, private, and protected.
     * */

    /*
    * Làm thế nào để khởi tạo 1 đối tượng của 1 member inner class ?
    *
    * An object or instance of a member's inner class always exists within an object of its outer class.
    * The new operator is used to create the object of member inner class with slightly different syntax.
    *
    * Syntax:
    * OuterClassReference.new MemberInnerClassConstructor();
    * VD: obj.new Inner();
    *
    * */

    private int data = 30;

    private class Inner {
        private void msg() {
            System.out.println("Data = " + data);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass outerClass = new MemberInnerClass();
        MemberInnerClass.Inner innerClass = outerClass.new Inner();
        innerClass.msg();
    }
}
