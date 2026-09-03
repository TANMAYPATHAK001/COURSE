class Calculator{
    public int add(int n1, int n2){
        
        int r = n1 + n2;
        return r;
    }
}

public class OOPs {
    public static void main(String[] args) {
        
        int num1 = 1; 
        int num2 = 2;

        Calculator calculator = new Calculator();

        int result = calculator.add(num1,num2);
        System.out.println(result);

    }
}
