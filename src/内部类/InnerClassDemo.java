package 内部类;

public class InnerClassDemo {

    private int a = 1;

    public void testInner() {
        System.out.println(new InnerClass().b);
        //外访问内：同名称属性或方法
        new InnerClass().print();
    }

    public void print() {
        System.out.println("Outer print");
    }

    class InnerClass {

        private int b = 2;

        public void print() {
            System.out.println("Inner print");
        }

        public void testOuter() {
            System.out.println(a);
            //内访问外：同名称的属性或方法
            InnerClassDemo.this.print();
        }
    }

    public static void main(String[] args) {

        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.testInner();
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
        innerClass.testOuter();
    }
}
