package NestedClasses;

public class Nested {
    public static void main(String[] args){
//        Outer outer = new Outer();
//        Outer.Inner inner = new Outer.Inner(outer);
//        inner.fun();

    }
}
//class Outer{
//    static int x = 5;
//    int y ;
//    static class Inner {
//        Outer outer;
//        Inner(Outer outer){
//            this.outer = outer;
//        }
//        void fun(/*Outer outer*/){
//            System.out.println(x);
//            System.out.println(outer.y);
//        }
//
//    }
//}

class BankAccount {
      private static class InterestCalculator {
       static  double calculatorYearly(double principal , double rate){
            return principal*rate;
        }
    }

    public double  computerInterest(double principle){
             return InterestCalculator.calculatorYearly(principle ,0.09);
    }

    // Use cases of static nested classes:
    /*
    1.As helper class for any outer class.
    2. Builder design pattern
    3.if you want to have static methods inside a nested class.
    4.Request/Response DTO
     */
}
