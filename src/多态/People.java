package 多态;

public class People {

    //多态：父类作为方法形参的示例写法
    public void feed(Pet pet) {
        pet.feed();
    }

    //多态：父类作为方法返回值的示例写法
    public Pet buyPet(int type) {
        if (type == 1) {
            return new Dog();
        }else if (type == 2) {
            return new Cat();
        }
        return null;
    }

    public void polyExample() {
//        feed(new Dog());
//        feed(new Cat());
        buyPet(1).feed();
        buyPet(2).feed();
    }
}
