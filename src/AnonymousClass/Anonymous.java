package AnonymousClass;


// Anonymous class
public class Anonymous {
    public static void main(String[] args){
//           Person  person1 = new Person();
//           person1.introduce();

//           Person person2  = new Person();
//           person2.introduce();
        Person p2 = new Person(){
            String name = "Aditya" ;

            @Override
            void introduce() {
                greet();
                System.out.println("hi, i am a guest");
            }
            void greet(){
                System.out.println("hello");
            }
        };
        p2.introduce();

    }
}
class Person{
    void introduce(){
        System.out.println("hi, i am a person");
    }
}
class Guest extends Person{
    @Override
    void introduce() {
        System.out.println("hi, i am a guest");
    }
}