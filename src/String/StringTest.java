package String;

public class StringTest {
    public static void main(String[] args) {
        String str = "111 eweww essd w s";
        //删空格的狗比方法
        String str2 = str.replace(" ", "");
        System.out.println(str2);

        String a = "abc";
        String b = "def";
        String c = "abcdef";
        String d = a + b;
        String e = "abc" + "def";
        System.out.println(c == d);
        System.out.println(c == e);
    }
}
