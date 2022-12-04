/**
 * 一维数组的深入，数组中存储的类型为：引用数据类型
 * 对于数组来说，实际上只能存储java对象的“内存地址”。数组中存储的每个元素是“引用”。
 */
public class ArraryTest06 {
    public static void main(String[] args) {
        // a是一个数组
        // a[0] 是数组中的一个元素。
        // a[1] 是数组中的一个元素。
        int[] a = {123,23,233};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        Animal a1 = new Cat();
        Animal a2 = new Bird();
        Animal[] animals = {a1,a2};
        // 对Animal数组进行遍历
        for (int i = 0;i<animals.length;i++){
            animals[i].move();
        }
        Animal[] animals1 = new Animal[2];
        animals1[0] = a1;
        animals1[1] = a2;
        for (int i =0;i<animals1.length;i++){
            // 这个取出来的可能是Cat，也可能是Bird，不过肯定是一个Animal
            // 如果调用的方法是父类中存在的方法不需要向下转型。直接使用父类型引用调用即可。
            //anis[i]
            //Animal an = anis[i];
            //an.move();

            //Animal中没有sing()方法。
            //anis[i].sing();

            // 调用子对象特有方法的话，需要向下转型！！！
            if (animals1[i] instanceof Cat){
                Cat c = (Cat) animals1[i];
                c.CatchMouse();
            }else {
                Bird b = (Bird)animals1[i];
                b.sing();
            }
        }
    }
}

class  Animal{
    public void move(){
        System.out.println("Animal move...");
    }
}
class Product{

}
class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("猫咪在上树");
    }
    public void CatchMouse(){
        System.out.println("猫咪在逮老鼠");
    }

}
class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("小鸟在飞行");
    }
    public void sing(){
        System.out.println("小鸟在歌唱");
    }
}
