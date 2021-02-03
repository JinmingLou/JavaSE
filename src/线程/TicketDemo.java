package 线程;

public class TicketDemo implements Runnable{
    private int num = 5;
    @Override
    public void run() {
            while(this.num >= 0) {
                synchronized (this) {
                    if(num > 0) {
                        System.out.println(Thread.currentThread().getName() + "正在卖第" + num + "张票");
                        this.num--;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void main(String[] args) {
        TicketDemo ticketDemo = new TicketDemo();
        Thread t1 = new Thread(ticketDemo, "A");
        Thread t2 = new Thread(ticketDemo, "B");
        Thread t3 = new Thread(ticketDemo, "C");

        t1.start();
        t2.start();
        t3.start();
    }
}
