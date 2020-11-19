package 引用;

public class Quote {

    private String name;

    private int age;

    public Quote(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void quoteExample() {
        //经典引用问题，两对象指向同一堆内存空间所以都为true
        Quote p1 = new Quote("a", 11);
        Quote p2 = p1;
        p2.setAge(222);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getAge());
    }

}
