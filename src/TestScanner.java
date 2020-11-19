import java.util.Scanner;

public class TestScanner {
    public static void testScanner() {
        //System.in 标准输入（装饰者模式）
        Scanner scanner = new Scanner(System.in);
        System.out.print("input something:");
        //有nextLine, nextInt, ...
        String str = scanner.next();
        System.out.println(str);


    }
}
