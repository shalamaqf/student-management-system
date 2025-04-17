public class Instructor extends Person{
    // attribute
    private Course course;
    private String courseID;
    private int creditHours;

    // constructor
    Instructor(String name, String status, Course course, String courseID, int creditHours){
        super(name, status);
        this.course = course;
        this.courseID = courseID;
        this.creditHours = creditHours;
    }

    // getter
    public String getInstructorName(){
        return this.getName();
    }

    // function to display instructor's information
    public void display(){
        System.out.println("Name\t: " + this.getName());
        System.out.println("Status\t: " + this.getStatus());
        System.out.println("Course\t: " + this.course.getCourseName());
        System.out.println("Course ID\t: " + this.courseID);
        System.out.println("Credit Hours\t: " + this.creditHours);
    }
}
