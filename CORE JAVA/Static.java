class Mobile{

    String brand;
    int price;
    static String name;

    static{
        System.out.println("in static block");
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
    // Note: Cannot use non-static variable with static method (Directly)

}

public class Static {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "oneplus";
        obj1.price = 22_000;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Vivo";
        obj2.price = 23_000;
        obj2.name = "Smartphone";

        // obj1.name = "Phone"; (name is made static for all the objects i.e. Phone)

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}
