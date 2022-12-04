public class InterfaceTest02 {
    public static void main(String[] args) {
        Flyable f = new Cat();
        f.fly();
        Flyable f2 = new Pig();
        f2.fly();

    }
}
class Animal{

}
interface Flyable{
    void fly();
}
class Cat extends Animal implements Flyable{
    public void fly(){
        System.out.println("飞猫起飞，翱翔太空的一只猫，很神奇，我想做一只猫！！");
    }
}
class Snake extends Animal{
}

class Pig extends Animal implements Flyable{
    public void fly(){
        System.out.println("如果猪会飞，我就会爱上你。");
    }
}

class Fish implements Flyable{ //没写extends，也是有的，默认继承Object。
    public void fly(){
        System.out.println("我是六眼飞鱼（流言蜚语）！！！");
    }
}