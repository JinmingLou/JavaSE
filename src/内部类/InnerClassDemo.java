package 内部类;

public class InnerClassDemo {

    private int a = 1;

    public void testInner() {
        System.out.println(new InnerClass().b);
        //外访问内：同名称属性或方法
        new InnerClass().print();

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run!!!");
            }
        });
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

    //静态内部类
    static class StaticInner {

    }

    //方法内部类
    public void methodInner() {
        int a = 666;
        class MethodInner {
            public void testMethodInner() {
                System.out.println(a);
            }
        }
        new MethodInner().testMethodInner();
    }

    //静态内部类实例化方法：外部类只作声明，new写在前面
    public void staticInnerExample() {
        InnerClassDemo.StaticInner staticInner = new InnerClassDemo.StaticInner();
    }

    public static void main(String[] args) {

        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.testInner();
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
        innerClass.testOuter();
        innerClassDemo.methodInner();
    }
}
