import java.util.Scanner;
public class Student_Database {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students data would you like to enter? PRESS ENTER TWICE PLEASE");
        int amount = scan.nextInt();

        Student[] students = new Student[amount];
        for(int i = 0; i<amount;i++) {
            Student student = new Student("this.fname","this.lname","this.email","this.address","this.city","this.state","this.id","this.classstanding","this.zip");
            student.getInfo();
            students[i] = student;
        }
        for (Student student : students) {
            student.displayInfo();
        }
        System.out.println("Number of students: "+amount);
    }
}
