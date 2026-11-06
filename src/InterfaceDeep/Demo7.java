package InterfaceDeep;

public class Demo7 {
    public static void main(String[] args){
        R r = new R();
        r.fun();
    }
}
 // Java resolution priority rule

interface P{
      default void fun(){
          System.out.println("P");
      }
}
class Q {
    public void fun(){
        System.out.println("Q");
    }


}
class R extends Q implements P {

}