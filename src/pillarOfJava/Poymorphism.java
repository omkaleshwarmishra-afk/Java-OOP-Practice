package pillarOfJava;

public class Poymorphism {
    public static void main(String[] args){
        A a = new B();
//        a.fun();
        System.out.println(a.getX());

    }
}
//1. Static methods cannot be overridden.
//2. Private methods cannot be overridden.
//3. Final methods cannot be overridden.
//4. Fields / Variables cannot be polymorphic.


//class A {
//    static void fun(){
//        System.out.println("hello");
//    }
//}
//class B extends A {
//    static void fun(){
//        System.out.println("Bye");
//    }
//}

class A {
//    int x = 10;
           int getX(){
               return 10;
           }
}
class B extends A {
//    int x =
    int getX(){
        return 20;
    }
}