public class Main {
    public static void main(String[] args) {
        // create instructor object
        Instructor instructor1 = new Instructor("Joel", "Instructor", null, "112233", 2);
        
        // create course object
        Course mathCourse = new Course("Math", instructor1);
        
        // create student object
        Student student1 = new Student("Ellie", "Student", "12345");
        Student student2 = new Student("Abby", "Student", "56789");

        mathCourse.addStudent(student1);
        mathCourse.addStudent(student2);
        mathCourse.display();
        student1.display();
        
        mathCourse.removeStudent(student2);
        mathCourse.display();

        student2.display();        

       

        
    }
}
