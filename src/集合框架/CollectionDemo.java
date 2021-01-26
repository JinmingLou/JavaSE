package 集合框架;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);
        collection.add(1.1);
        collection.add(true);
        collection.add("abc");
        System.out.println(collection);
        //含ibdex的add只有arraylist实现了，collection没有
        ((ArrayList)collection).add(3, "qqq");
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.addAll(collection);

        System.out.println(collection.contains("abc"));
        Collection collection2 = new ArrayList();
        collection2.add(1.1);
        collection2.add(1);
        //containsAll不区分顺序
        System.out.println(collection.containsAll(collection2));

        for(int i = 0; i < 20; i ++) {
            collection1.add("a");
        }

        //只删一个
        collection1.remove("a");
        System.out.println(collection1);

        //retain
        System.out.println(collection1);
        System.out.println(collection.retainAll(collection));
        System.out.println(collection1);


    }
}
