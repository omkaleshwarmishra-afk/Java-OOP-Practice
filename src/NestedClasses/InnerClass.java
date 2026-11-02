package NestedClasses;


public class InnerClass {
    public static void main(String[] args){

//        Outer outer = new Outer();

//          Outer.Inner inner = new Outer.Inner();

//        Outer.Inner inner =  outer.new Inner();
        Outer.Inner inner = new Outer().new Inner();

           inner.fun();
    }
}
class Outer{
    class Inner{
           void fun(){
               System.out.println("hello");
           }
    }
}
