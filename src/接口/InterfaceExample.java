package 接口;

public class InterfaceExample implements Interface {

    public int a;

    @Override
    public void a111() {
        a = 111;
    }

    @Override
    public int bbb() {
        return 0;
    }

    public void interfaceExample() {
        System.out.println(a);
    }
}
