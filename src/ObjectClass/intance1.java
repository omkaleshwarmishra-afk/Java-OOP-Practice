package ObjectClass;

public class intance1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();

        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());

        System.out.println(a instanceof Animal);
    }
}
class Animal {

}
class Dog extends Animal {

}

// clone method create copy of an Object
// protected object clone() throws  classNotSupported
// clonable interface implement