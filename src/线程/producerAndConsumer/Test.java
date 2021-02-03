package 线程.producerAndConsumer;

public class Test {
    public static void main(String[] args) {

        Cargo cargo = new Cargo();

        Producer producer = new Producer(cargo);
        Consumer consumer = new Consumer(cargo);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}
