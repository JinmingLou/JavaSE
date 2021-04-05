package 线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService =  Executors.newCachedThreadPool();
        for (int i = 0; i < 20; i ++) {
            executorService.submit(new Task());
        }
        executorService.shutdown();
    }
}
