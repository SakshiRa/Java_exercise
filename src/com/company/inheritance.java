package com.company;

class P {
    public void m1(){
        System.out.println("parent");
    }
}

class C extends P {
    public void m2()
    {
        System.out.println("child");
    }
}

// child can use parent method but parent cannot use   child method
// parent reference can hold child object but child reference cannot hold parent reference

class Test{
    public static void main(String[] args){
        P p = new P();
        p.m1();
        //p.m2(); --> child class method, cannot use

        C c = new C();
        c.m1();
        c.m2();

        P parent = new C();
        parent.m1();
        //parent.m2(); --> parent reference and child object can access parent method but not child method

        //C child = new P(); --> cannot cast child to parent
        //c.m1();
        //c.m2();
    }
}
