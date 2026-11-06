package InterfaceDeep;

public class Demo5 {
    public static void main(String[] args){
      Vehicle v = new Car();
      v.drive();
    }
}
 // after java 8  --> Default methods , static , private
// List Interface --> methods

interface Vehicle {
     default void drive(){
         System.out.println("Vehicle is driving");
     }
}

class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Vehicle is driving");
    }
}