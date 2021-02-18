package com.company;

// every method present in interface is always public and abstract
public interface inter {
    void m1();
    void m2();

}

// while providing implementation of methods in inter, we have to provide public access to methods
// if not able to provide implementation, provide abstract!
abstract class serviceProvider implements inter{
    public abstract void m1();
    public abstract void m2();
}

// child class of serviceprovider
class subserviceprovider extends serviceProvider {
    public void m1() {}
    public void m2() {}
}
