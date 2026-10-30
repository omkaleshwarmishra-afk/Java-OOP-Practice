public class finalKeyword {


    public static void main(String[] args){
        Random r1 = new Random();
        System.out.println(r1.PI);

//        r1.PI = 3.16; cannot reassign

        final int  x ;
            x  = 4;
        System.out.println(x);
    }
}


// why main is static in java
// Demo4 de = new Demo4();
//d1.main();
class Random {
//    final double PI =3.14;
      final double PI ;

      Random(){
          this.PI = 3.14;
      }
}
