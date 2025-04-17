public class Student extends Person{
    
    // constructor
    Student(String name, String status, String ID){
        super(name, status, ID);
    }

    // function to display student's information
    public void display(){
        System.out.println("Name\t: " + this.getName());
        System.out.println("Status\t: " + this.getStatus());
        System.out.println("ID\t: " + this.getID() + "\n");
    }
}
