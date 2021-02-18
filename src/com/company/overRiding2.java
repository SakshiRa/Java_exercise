package com.company;

// overriding only for methods not for variables

// variable hiding, shadowing
class P3 {
    String s = "parent";
}
class C3 extends P3{
    String s = "child";
}

class Test4 {
    public static void main(String[] args) {

    // variable always reference type printed
        P3 p3 = new P3();
        System.out.println(p3.s);

        C3 c3 = new C3();
        System.out.println(c3.s);

        P3 p4 = new C3();
        System.out.println(p4.s);

    }
}
