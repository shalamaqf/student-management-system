public abstract class Person{
    
    // attribute
    private String name;
    private String status;

    // constructor
    Person(String name, String status){
        this.name = name;
        this.status = status;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getStatus(){
        return this.status;
    }

    // abstract method
    public abstract void display();
}