class Human{
    private int age;
    private String name;

    // CONSTRUCTOR -> Has the same name as the class 
    // Does not return anything. 
    // Everytime constructor is called automatically when an object is created 
    public Human(){                   // Default Constructor
        System.out.println("in constructor");
    }
    public Human(int a, String n){   // Parameterised constructor
        age = a;
        name = n;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class Constructor {

    public static void main(String[] args) {
        
        Human obj = new Human();
        Human obj1 = new Human(18, "GunGun");
         obj.setAge(28);
         obj.setName("Tanmay");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());

    }
}
