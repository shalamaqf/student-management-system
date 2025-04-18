import java.util.ArrayList;

public class Course {
    
    // attribute
    private String courseName;
    private Instructor instructor;
    private ArrayList<Student> studentlist = new ArrayList<Student>();

    // constructor
    Course(String courseName, Instructor instructor){
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // getter
    public String getCourseName(){
        return this.courseName;
    }

    // function to add student to student's array list
    public void addStudent(Student student){
        studentlist.add(student);
        student.setCourse(this);
        
    }

    // function to display course's information
    public void display(){
        System.out.println("Course Name\t: " + this.courseName);
        System.out.println("Instructor\t: " + this.instructor.getInstructorName());
        System.out.println("Enrolled Student\t: ");
        for (Student student : studentlist){
            System.out.println("- " + student.getName());
        }

        System.out.println("\n");
    }


}
