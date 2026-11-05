package InterfaceDeep;

public class Demo {
    public static void main(String[] args){
//      Car car = new Thar();
//      car.drive();
        Payment p = new CreditCard();
        p.pay();
    }
}
// polymorphism
//interface Car {
//    void drive();
//}
//abstract class Thar implements Car{
//   abstract public void drive(){
////        System.out.println("Thar driving");
//    }
//    class BlackThar extends Thar {
//
//        @Override
//        public void drive(){
//
//        }
//    }
//
//}
interface Payment {
    void pay();
}
class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("Paying via credit card");
    }
}
class DebitCard implements Payment {
    @Override
    public void pay(){
        System.out.println("Paying via debit card");
    }
}