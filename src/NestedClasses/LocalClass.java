package NestedClasses;


//Local classes
public class LocalClass {
    public static void main(String[] args) {
     Outer1 outer = new Outer1();
     outer.greet();

    }
}
// Effective final variable

   class Outer1 {
//    private int x =4;
       void greet() {
           int y =5;
           class Local {
               void sayHello() {
                   System.out.println(y);
               }
           }
           Local local = new Local();
           local.sayHello();
       }
}
/*
constructor
method
if

 */