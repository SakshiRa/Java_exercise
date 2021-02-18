package com.company;

class P1 {
    public void property() {
        System.out.println("cash + land + gold");
    }

    public void marry() {
        System.out.println("appalama");
    }
}

class C1 extends P1 {
    public void marry() {
        System.out.println("katrina");
    }
}

class Test2 {
    public static void main(String[] args) {

        // parent reference and parent runtime object
        // appalama (no overriding)
        P1 p = new P1();
        p.marry();

        // child reference and child runtime object
        // katrina (no overriding)
        C1 c = new C1();
        c.marry();

        // parent reference child runtime object
        // katrina (over riding)
        P1 p1 = new C1();
        p1.marry();
    }
}
