package 枚举;

public class Test {
    public static void main(String[] args) {
        Gender gender = Gender.BOY;
        System.out.println(gender.genderr);
        System.out.println("-----------");
        Gender[] gender2 = Gender.values();
        for(int i = 0; i < gender2.length; i ++) {
            System.out.println(gender2[i].genderr);
        }
    }
}
