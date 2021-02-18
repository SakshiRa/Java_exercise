package com.company;

abstract class Shape {
     abstract String draw();
}

class Triangle extends Shape{

     @Override
     String draw() {
          return "Triangle";
     }
}

class Circle extends Shape{
     @Override
     String draw() {
          return "Circle";
     }
}

class App{
     public static void main(String[] args) {
          Triangle t = new Triangle();
          System.out.println(t.draw());
          Circle c = new Circle();
          System.out.println(c.draw());
     }
}