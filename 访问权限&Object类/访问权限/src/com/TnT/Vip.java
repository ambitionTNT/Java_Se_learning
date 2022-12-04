package com.TnT;

import com.baidu.User;

public class Vip extends User {

    //实例方法
    public void shopping(){

        System.out.println(this.age);//public 随便访问
       // System.out.println("name"+this.name);//不同包不能访问
        System.out.println(this.weight);//在不同包，子类 protected可以访问到

    }
}

