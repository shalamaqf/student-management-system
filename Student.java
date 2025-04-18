public class Student extends Person{
    
    // attribute
    private String studentID;
    private Course course;

    // constructor
    Student(String name, String status, String studentID){
        super(name, status);
        this.studentID = studentID;
    }

    // setter
    public void setCourse(Course course){
        this.course = course;
    }

    // function to display student's information
    public void display(){
        System.out.println("Name\t: " + this.getName());
        System.out.println("Status\t: " + this.getStatus());
        System.out.println("ID\t: " + this.studentID);

        if (this.course != null){
        System.out.println("Course\t: " + this.course.getCourseName() + "\n");
        }else{
            System.out.println("Course\t: Not assigned\n");
        }
    }

    
}
