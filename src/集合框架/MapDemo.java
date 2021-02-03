package 集合框架;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "aaa");
        map.put(2, "bbb");
        map.put(3, "ccc");
        System.out.println(map);

        System.out.println(map.isEmpty());

        System.out.println(map.size());

        // map.clear();

        System.out.println(map.containsKey("111"));
        System.out.println(map.containsValue("bbb"));

        System.out.println(map.get(3));

        map.remove(1);
        System.out.println(map.remove(3, "ddd"));
        System.out.println(map);

        System.out.println("-----------------");

        //遍历
        Set<Integer> keySet = map.keySet();
        for (int i : keySet) {
            System.out.println(i + "=" + map.get(i));
        }

        //得不到key
        Collection<String> values = map.values();

        System.out.println("-----------------");

        //k，v成组出现，迭代器没有.hasPrevious(),foreach也能用
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
//        while(iterator.hasNext()){
//            Map.Entry<Integer, String> next = iterator.next();
//            System.out.println(next.getKey() + " : " + next.getValue());
//        }
        for (Map.Entry<Integer, String> i : entries) {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
    }
}
