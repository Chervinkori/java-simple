package maivka.dz10;

public abstract class Student {

    public String firstName;
    public String lastName;
    public String group;
    public double averageMark;


    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String name){
        name = lastName;
        System.out.println(name);
    }

}
