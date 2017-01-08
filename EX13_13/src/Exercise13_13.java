//use 10.6 from another student
import ToolKit.Course;

public class Exercise13_13 {
    public static void main(String[] args) {

        Course course1 = new Course("Course1");
        course1.addStudent("student1");
        course1.addStudent("student2");
        Course course2 = (Course)course1.clone();
        // Checking if any of the members have the same reference
        System.out.println(course1 == course2);
        System.out.println(course1.getCourseName() == course2.getCourseName());
        System.out.println(course1.getStudents() == course2.getStudents());
    }
}