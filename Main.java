public class Main {
    public static void main(String[] args) {
        // create instructor object
        Instructor instructor1 = new Instructor("Joel", "Instructor", null, "112233", 2);
        
        // create course object
        Course mathCourse = new Course("Math", instructor1);
        
        // create student object
        Student student1 = new Student("Ellie", "Student", "12345");

        student1.display();
        mathCourse.display();

        mathCourse.addStudent(student1);
        mathCourse.display();
        

       

        
    }
}
