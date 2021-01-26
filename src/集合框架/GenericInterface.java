package 集合框架;

public interface GenericInterface<E> {
    public E test();
}

class GenericSub<E> implements GenericInterface<E> {

    public E e;

    @Override
    public E test() {
         return e;
    }

    public GenericSub(E e) {
        this.e = e;
    }

    public <Q> Q qTest(Q q) {
        return q;
    }

    public static void main(String[] args) {
        GenericSub<String> genericSub = new GenericSub<String>("abc");
        System.out.println(genericSub.test());
        System.out.println(genericSub.qTest(true));
    }
}
