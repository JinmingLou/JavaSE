package 集合框架;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(123);
        linkedList.add(1.2);
        linkedList.add("hello");
        linkedList.add(666.666);

        //迭代器
        Iterator iterator = linkedList.iterator();
        ListIterator listIterator = linkedList.listIterator();
        while(listIterator.hasNext()) {
            Object aaa = listIterator.next();
            //直接删会出现并发异常
//            if(aaa.equals(123)) {
//                linkedList.remove(aaa);
//            }
            //正确删除方法
            if (aaa.equals(123)) {
                listIterator.remove();
            }
            System.out.println(aaa);
        }

        //反向迭代器，指针指向最后了才能向前用
        System.out.println("---------------------");
        while(listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

        //for循环式迭代器
        System.out.println("---------------------");
        for(Object obj : linkedList) {
            System.out.println(obj);
        }
    }
}
