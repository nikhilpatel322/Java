public class StudentRecords {

    // Instance variables
    private String name; // Student's name
    private int age;     // Student's age

    //  initialize instance variables
    public StudentRecords(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    /////display student information
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        //// Create two student objects
        StudentRecords student1 = new StudentRecords("Nikhil", 21);
        StudentRecords student2 = new StudentRecords("Aadesh", 18);

        //////Display information 
        System.out.println("Student 1:");
        student1.displayStudentInfo();

        System.out.println("\nStudent 2:");
        student2.displayStudentInfo();
    }
}
