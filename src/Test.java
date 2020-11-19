public class Test {
    public static void test() {
        //三木运算经典套娃
        System.out.println(true?false:true?false:true);
        System.out.println(false?false:true?false:true);
        //取反，取的时候作为补码处理
        System.out.println(~4);
    }

    public static void main(String[] args) {
        //经典引用问题，两对象指向同一堆内存空间所以都为true
        Polymorphism p1 = new Polymorphism("a", 11);
        Polymorphism p2 = p1;
        p2.setAge(222);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getAge());
    }
}
