import java.util.Scanner;

class Student {
    float marks1, marks2, marks3;

    // method 1
    String InputName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Student :");
        String name = sc.nextLine();
        return name;
    }

    // method 2
    String average() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of exam 1: ");
        float marks1 = sc.nextFloat();

        System.out.print("Enter marks of exam 2: ");
        float marks2 = sc.nextFloat();

        System.out.print("Enter marks of exam 3: ");
        float marks3 = sc.nextFloat();

        float average = (marks1 + marks2 + marks3) / 3;

        if (average > 50)
            return "Passed";
        else
            return "Failed";

    }
}

public class Q6l5_StudentInfo {
    public static void main(String[] args) {
        Student s = new Student();
        String name = s.InputName();
        String result = s.average();

        System.out.println("\nStudent Name: " + name);
        System.out.println("Result: " + result);
    }
}
