package com.baidu;

public class User{
    private int id;
    public int age;
    protected int weight;
    String name;
    public void m1(){
        System.out.println("m1()");
    }
    private void m2(){
        System.out.println("m2()");
    }
    void m3(){
        System.out.println("m3()");
    }
    protected void m4(){
        System.out.println("m4()");
    }
}