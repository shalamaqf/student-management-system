public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Ellie", "Student", "12345");
        Person instructor1 = new Instructor("Joel", "Instructor", "56789");

        student1.display();
        instructor1.display();
    }
}
