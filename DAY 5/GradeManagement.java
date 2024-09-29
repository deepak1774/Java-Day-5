import java.util.Scanner;

class Student {
    private String name;
    private double homeworkGrade;
    private double finalExamGrade;

    public Student(String name, double homeworkGrade, double finalExamGrade) {
        this.name = name;
        this.homeworkGrade = homeworkGrade;
        this.finalExamGrade = finalExamGrade;
    }
    public String getName() {
        return name;
    }
    public double getHomeworkGrade() {
        return homeworkGrade;
    }
    public double getFinalExamGrade() {
        return finalExamGrade;
    }
    public double calculateAverageGrade() {
        return (homeworkGrade + finalExamGrade) / 2.0;
    }
}

public class GradeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter homework grade: ");
        double homeworkGrade = scanner.nextDouble();
        System.out.print("Enter final exam grade: ");
        double finalExamGrade = scanner.nextDouble();
        Student student = new Student(name, homeworkGrade, finalExamGrade);
        double averageGrade = student.calculateAverageGrade();
        System.out.println("\nStudent Name: " + student.getName());
        System.out.println("Homework Grade: " + student.getHomeworkGrade());
        System.out.println("Final Exam Grade: " + student.getFinalExamGrade());
        System.out.println("Average Grade: " + averageGrade);
        scanner.close();
    }
}
