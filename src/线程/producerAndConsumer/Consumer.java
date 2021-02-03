package 线程.producerAndConsumer;

public class Consumer implements Runnable{
    private Cargo cargo;

    public Consumer(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++) {
            cargo.getCargo();
        }
    }
}
