public class Operators{
    public static void main(String [] args){
        
        // ARITHMETIC (+, -, /, *, %, ++, --)
        // RELATIONAL (<,>,==, !=, <=, >=)
        // LOGICAL (&, |, !) short circuit (&&, ||, !)
        // TERNARY (?:)

        
        // int num1 = 2;
        // num1 = num1 + 2;
        // // OR
        // num1 += 2; 
        // System.out.println(num1);

        double x = 5.3;
        double y = 9.0;

        int a = 8;
        int b = 6;

        // boolean result = x >= y || a >= b;
        // System.out.println(result);

        // Note: short circuit -> if one condition is sufficient it will not check the other, saves time

        int n = 4;
        int result = 0;

        if(n%2==0){
            result = 10;
        }
        else {
            result = 20;
        } 

        // OR

        result = n%2==0 ? 10:20;
        
        System.out.println(result);
    }
}