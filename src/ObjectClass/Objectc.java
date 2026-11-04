package ObjectClass;

import java.util.Objects;

public class Objectc {
    public static void main(String[] args) throws  CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "om";
//        s1.name = null;
        s1.age = 21;
//        System.out.println(s1.toString());

        Student s2 = new Student();
        s2.name = "om";
        s2.age = 21;

//        System.out.println(s1.equals(s2));
//        System.out.println(s1.hashCode()== s2.hashCode());
//        System.out.println(s1.getClass().getName());
        Student s3  = (Student) s1.clone();
        System.out.println(s3.name);
    }
}
// instaceOf  operetor -> check instace

class Student extends Object  implements  Cloneable{
    String name;
    int age;

    @Override
    public String toString(){
          return (name+ "." +age);
    }
    @Override
    public boolean equals (Object obj){

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);
    }
    @Override
    public int hashCode() {

           int result = 17;
            result = result*31 + age;
            result = result*31 + (( name == null) ? 0 : name.hashCode());

           return Objects.hash(name ,age);
    }

    // clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    }
//hashCode
// getClass  (final method <?> )
// marker interface -> empty
// finalize method -> garbage collection