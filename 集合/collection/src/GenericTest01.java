import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Cat c = new Cat();
        Bird b = new Bird();
        list.add(c);
        list.add(b);
        /*Iterator it = list.iterator();
        while (it.hasNext()){
            Object o=it.next();//无论存储的是什么返回的都是Object类型，所以要向下转型
            //以调用move()的方法
            if(o instanceof Animal){
                Animal a = (Animal)o;
                a.move();
            }
        }*/
        List<Animal> list1 = new ArrayList<Animal>();
        list1.add(c);
        list1.add(b);
       //list1.add(199);
        Iterator<Animal> it = list1.iterator();
        while (it.hasNext()){
            Animal a = it.next();
            if (a instanceof Cat){
                Cat c1 = (Cat)a;
                c1.catchMouse();
            }
            if (a instanceof  Bird){
                Bird b1 = (Bird)a;
                b1.fly();
            }
        }
    }
}
class Animal{
    // 父类自带方法
    public void move(){
        System.out.println("动物在移动！");
    }
}

class Cat extends Animal {
    // 特有方法
    public void catchMouse(){
        System.out.println("猫抓老鼠！");
    }
}

class Bird extends Animal {
    // 特有方法
    public void fly(){
        System.out.println("鸟儿在飞翔！");
    }
}