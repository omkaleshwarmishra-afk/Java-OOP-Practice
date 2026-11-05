package InterfaceDeep;

public class Demo2 {
    public static void main(String[] args){
         MathConstant r = new Random();
         r.fun();
    }
}
// Variable inside interface
interface MathConstant {
      double PI_VALUE = 3.14;
      int VALUE= 10;
      void fun();

}
class Random implements MathConstant {
    @Override
    public void fun(){
        System.out.println(PI_VALUE);
    }
}