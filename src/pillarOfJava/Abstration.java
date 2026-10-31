package pillarOfJava;


//low level abstration
//high level   abstration  1 abstract classes  2 interface
public class Abstration {
    public static void main(String[] args){
             car ca = new ElectricCar();
             ca.start();
             ca.accelerate();
             ca.brake();
    }



}

 abstract class car{
    void start (){
        System.out.println("car started");

    }
    abstract void accelerate();
//    {
//        System.out.println("car is accelerating at 10km/h");
//    }
   abstract void brake();
//    {
//        System.out.println("car is stopping");
//    }

}
class FuelCar extends car {
    @Override
    void accelerate() {
        System.out.println("car is accelerating at 10km/h");
    }

    @Override
    void brake() {
        System.out.println(" Electric car is stopping");
    }
}
class ElectricCar extends car {
    @Override
    void accelerate() {
        System.out.println("car is accelerating");
    }

    @Override
    void brake() {
        System.out.println(" Electric car is stopping slowly");
    }
}
// interfaces
 