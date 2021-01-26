package 集合框架;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        //hashset
        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add(123);
        hashSet.add(456);
        hashSet.add("hello");
        hashSet.add(new Dog());
        System.out.println(hashSet);

        for(Object obj : hashSet) {
            System.out.println(obj);
        }
    }
}

class Dog {
    int age = 1;
    String name = "Putty";
}
