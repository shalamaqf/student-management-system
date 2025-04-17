public abstract class Person{
    
    // attribute
    private String name;
    private String status;
    private String ID;

    // constructor
    Person(String name, String status, String ID){
        this.name = name;
        this.status = status;
        this.ID = ID;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getStatus(){
        return this.status;
    }

    public String getID(){
        return this.ID;
    }

    // abstract method
    public abstract void display();
}