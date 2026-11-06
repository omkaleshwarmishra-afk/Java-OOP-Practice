package InterfaceDeep;

public class Demo6 {
    public static void main(String[] args){
       D d = new D();
       d.fun();
    }
}
interface L {
    void fun();
}
interface M extends L {
       default void  fun(){
           System.out.println("M");
       }
}
interface N extends L{
       default void fun(){
           System.out.println("N");
       }
}
class D implements  M , N{
    @Override
    public void fun(){
         M.super.fun();
         N.super.fun();
;
    }

}