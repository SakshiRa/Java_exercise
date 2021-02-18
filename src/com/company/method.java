package com.company;

class method {
    public void m1() {
        System.out.println("no-arg");
    }

    public void m1(int i) {
        System.out.println("int-arg");
    }

    // any number of int values using int...
    /*public void m1(int... i) {
        System.out.println("int...-arg");
    }*/

    public void m1(double d) {
        System.out.println("double-arg");
    }

    public void m1(String  s) {
        System.out.println("String-arg");
    }

    public void m1(StringBuffer sb) {
        System.out.println("stringbuffer-arg");
    }

    public void m1(int i, float f){
        System.out.println("int-float version");
    }

    public void m1(float f, int i){
        System.out.println("float-int version");
    }

    public static void main(String[] args) {
        method m = new method();
        m.m1();
        m.m1();
        m.m1(10,10.5f);
        m.m1(10.5f, 10);
        m.m1(8.9);
        m.m1("c");
        m.m1(new StringBuffer("durga"));
    }
}

