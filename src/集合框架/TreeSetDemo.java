package 集合框架;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Cat("A",12));
        treeSet.add(new Cat("B",5));
        treeSet.add(new Cat("C",20));
        System.out.println(treeSet);

        //泛型
        TreeSet<String> treeGeneric = new TreeSet<String>();
        treeGeneric.add("aaa");
        treeGeneric.add("qwww");
    }
}

class Cat implements Comparable {

    public void setName(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private String name;

    private int age;

    @Override
    public int compareTo(Object o) {
        Cat c = (Cat)o;
        if(c.age>this.age) {
            return 1;
        }else if (c.age == this.age) {
            return 0;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
