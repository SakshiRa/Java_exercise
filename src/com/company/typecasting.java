package com.company;


class base1 {
}

class base2 {
}

class der1 extends base1 {
}

class der2 extends base1 {
}

class der3 extends base2 {
}

class der4 extends base2 {
}

class Test5 {

    public static void main(String[] args) {

        //
        base2 b = new der4();

        // type of c and d have a C/P relationship, c is same as a, d is derives type of b
        der4 d = (der4) b;

        // c and d do not have a relation
        //base1 b1 = (base1) b;

        // c and d have same type, c and a are same type, d is same as c
        base2 b2 = (base2) b;

        // c and d have a C/P relation, c and a have a C/P relation, d is derived of b
        // redundant to cast object in der3
        Object o = (der3) b;

        // c and d do not have a relation
        //base2 b3 = (base1) b;
    }
}