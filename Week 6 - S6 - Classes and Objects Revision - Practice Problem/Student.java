class Student {
    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    public Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++; // increments once inside the constructor, every time
    }

    // Static method that prints collegeName and studentCount and must not reference any instance field
    public static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class StudentCollegeTest {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 92.5);
        Student s2 = new Student("Bob", 88.0);

        // Call printCollegeInfo() through the class name, not through either object
        Student.printCollegeInfo();
    }
}