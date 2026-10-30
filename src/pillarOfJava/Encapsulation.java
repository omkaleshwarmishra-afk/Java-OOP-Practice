package pillarOfJava;

public class Encapsulation {
    public static void main(String[] args){


        BankAccount ba  = new BankAccount();
//        ba.balance = 10000.0;
//
//        System.out.println(ba.balance);
        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());

    }


}

class BankAccount {
//    double balance;
   private double balance;

   public void deposit(int amount){
       balance += amount;
   }

    public void withdraw(int amount){
        balance -= amount;
    }
   // getter /setters
    public double getBalance(){
        return balance;
    }
}
class student{
   private String name;
    private int rollNumber;
    private int age;
    private String college;

    public student(String name, int rollNumber, int age, String college) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.college = college;
    }


    // getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}