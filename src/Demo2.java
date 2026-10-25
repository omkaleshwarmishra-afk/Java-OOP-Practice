public class Demo2 {

    public static void main(String[] args) {

        Student2 s2= new Student2();

        System.out.println(s2.name);
        System.out.println(s2.age);

    }
}


class Student2 {
    String name;
    int age;
    int rollNumber;
    String college;

    Student2(){

        name = "Omkaleshvar";
        age = 22;
        rollNumber= 101;
        college = "IPEC";



    }

    void markAttendence() {
        System.out.println("Attendence marks by name " + name);
    }
}