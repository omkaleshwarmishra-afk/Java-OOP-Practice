package pillarOfJava;

public class Inheritance {

    public static void main(String[] args){
        EngineerStudent es =new EngineerStudent();
        es.markAttendence();
        es.attendLab();



    }
}

class Student {
    String name ;
    int age;

    void markAttendence() {
        System.out.println("Attendence marked" );
    }

}
class EngineerStudent extends Student{
    void attendLab(){
        System.out.println("lab attended");
    }
}


// Type of inheritance
//simple
//multilevel
//hierarical
