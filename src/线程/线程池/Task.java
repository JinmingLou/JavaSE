package 线程.线程池;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "QwQ");
    }
}
