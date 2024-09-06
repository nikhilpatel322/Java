class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public void setDetails(String studentName, int studentRollNumber, double studentMarks) {
        name = studentName;
        rollNumber = studentRollNumber;
        marks = studentMarks;
    }

    public void display() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setDetails("Nikhil Patel", 1069, 85.5);
        student1.display();
    }
}
