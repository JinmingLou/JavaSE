package 线程.producerAndConsumer;

public class Producer implements Runnable{
    private Cargo cargo;

    public Producer(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i ++) {
            if(i % 2 == 0) {
                cargo.setCargo("旺旺", "雪饼");
            }else {
                cargo.setCargo("娃哈哈", "矿泉水");
            }
        }
    }
}
