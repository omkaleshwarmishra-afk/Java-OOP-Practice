public class Demo3 {


    public static  void main(String[] args) {
        Student3 s1 = new Student3("omkaleshvar",22);
        Student3 s2 = new Student3();
        Student3 s3 = new Student3("omkaleshvar",22 ,101);


        System.out.println(s3.rollNumber);


    }
    }
    // constructor chaining
class Student3 {
    String name;
    int age;
    int rollNumber;
    String college;

    Student3(){

    }

    Student3(String name){
        this.name = name;

    }

    Student3(String name , int age ){
        this(name,age , 0);

    }

    Student3(String name , int age , int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;

    }


    void markAttendence() {
        System.out.println("Attendence marks by name " + name);


    }

}
