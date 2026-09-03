public class Conditionals {
    public static void main(String[] args) {
        
        // if-else
        int x = 5;
        int y = 7;
        int z = 8;

        if (x>y && x>z) {
            System.out.println("Thank you");
        } 
        else if(y>x && y>z){
            System.out.println("Jam-Jam"); 
        } 
        else {
            System.out.println("hehe");
        }

        // Note: if single statement no curly braces, if multiple staement then curly braces.

        // switch-case

        int n = 8;

        switch(n){
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter value between 1-7");
        }

 
 





        



    }
}
