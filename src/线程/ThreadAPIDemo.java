package 线程;

public class ThreadAPIDemo {
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程名称
        System.out.println(thread.getName());
        //获取线程ID
        System.out.println(thread.getId());
        //获取线程优先级,一般系统中范围0-10的值，没经过设置默认5，有些系统0-100
        System.out.println(thread.getPriority());
        //设置线程优先级
        thread.setPriority(1);
        System.out.println(thread.getPriority());

        System.out.println(thread.isAlive());
    }
}
