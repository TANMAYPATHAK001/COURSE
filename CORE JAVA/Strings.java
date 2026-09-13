public class Strings {
    public static void main(String[] args) {
        
       //String name = new String("Tanmay");
       //OR

    //    String name = "Tanmay";
    //    name = name + " Pathak";
    //    System.out.println("hello " + name);

    //    System.out.println(name.concat(" Pathak"));



    //MUTABLE: change (String Buffer(thread safe), String Builder(thread unsafe))

    StringBuffer sb = new StringBuffer("Tanmay");
    sb.append(" Pathak");
    System.out.println(sb);

    String str = sb.toString();

    
    //IMMUTABLE: cannot be changed

    }
}
