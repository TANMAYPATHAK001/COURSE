class A{

    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in a show");
    }
}

public class AnnonymousObject {
    public static void main(String[] args) {
        
        new A(); // annonymous object

    }
}
