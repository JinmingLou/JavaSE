package 位运算与反补掩码;

public class Code {
    public static void codeExample() {
        //三木运算经典套娃
        System.out.println(true?false:true?false:true);
        System.out.println(false?false:true?false:true);
        //取反，取的时候作为补码处理
        System.out.println(~4);
    }
}
