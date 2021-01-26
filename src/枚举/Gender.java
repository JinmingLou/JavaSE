package 枚举;

public enum Gender {
    BOY("boy"), GIRL("girl"), MIDDLE("wtf???");

    public String genderr;

    //这样把值取出来
    Gender(String genderr) {
        this.genderr = genderr;
    }

    public void show() {
        System.out.println(this.BOY);
    }
}
