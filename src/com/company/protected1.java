package com.company;

// protected methods and variables can be accessed in the same package
// but to access it outside we have to use only child classes

// parent class A
public class protected1 {
    protected void m1(){
        System.out.println(" a class protected method");
    }
}

// child class B
/*class B extends A {
    public static void main (String[] args){

        // parent reference parent object
        A a = new A();
        a.m1();

        // child reference child object
        B b = new B();
        b.m1();

        // parent reference child object
        A a1 = new B();
        a1.m1();
    }
}*/