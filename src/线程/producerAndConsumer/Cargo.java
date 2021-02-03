package 线程.producerAndConsumer;

public class Cargo {
    private String brand;
    private String name;
    //锁
    private boolean flag = false;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public synchronized void setCargo(String brand, String name) {
        if(flag) {
            try {
                wait();
            }catch(Exception e) { }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("li生产了" + this.getBrand() + this.getName());
        this.flag = true;
        //唤醒
        notify();
    }

    public synchronized void getCargo() {
        if(!flag) {
            try {
                wait();
            }catch(Exception e) { }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("lou消费了" + this.getBrand() + this.getName());
        this.flag = false;
        //唤醒
        notify();
    }
}
