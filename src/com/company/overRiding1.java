package com.company;

class P2 {
    public void m1(int... i ) {
        System.out.println("parent class");
    }
}

class C2 extends P2 {
    public void m1(int... i ) {
        System.out.println("child class");
    }
}

class Test3 {
    public static void main(String[] args) {

        // parent runtime object, parent print
        P2 p2 = new P2();
        p2.m1(10);

        // child runtime object, child print
        C2 c2 = new C2();
        c2.m1(10);

        // child runtime object, parent print
        // static methods, method hiding, compiler chooses reference to print
        P2 p3 = new C2();
        p3.m1(10);
    }
}
