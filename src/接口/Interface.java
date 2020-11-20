package 接口;

public interface Interface {

    //public static final 不用写，默认的
    public static final int a = 100;

    void a111();

    //default 同包内使用，实现类调用此方法时默认调用接口中此方法
    default int bbb() {
        return 111;
    };

    //静态声明
    static void ccc() {

    }
}
