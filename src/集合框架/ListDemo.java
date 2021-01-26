package 集合框架;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(1.1);
        list.add(true);
        list.add("abc");
        System.out.println(list.get(0));
        System.out.println(list.indexOf("aaa"));

        //迭代器
        Iterator iterator = list.iterator();
    }
}
