

// static keyword

public class Demo5 {

    static class Student {
        String name;
        int age;
        int rollNumber;

        static String college;
        static int grade;

        Student(String name, int age, int rollNumber) {
            this.name = name;
            this.age = age;
            this.rollNumber = rollNumber;
        }

        static {
            college = "IIT Guwahati";
            grade = 8;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("College: " + college);
            System.out.println("Grade: " + grade);
            System.out.println("------------------");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Om", 20, 101);
        Student s2 = new Student("Rahul", 21, 102);

        s1.display();
        s2.display();
    }
}
