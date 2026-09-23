class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,6);
        int r2 = obj.sub(4, 6);
        int r3 = obj.multi(4, 6);
        int r4= obj.div(4, 6);
        double r5 = obj.power(4, 6);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);

    }
}

// single level, multi-level,  is allowed 
// multiple inheritance is not allowed, one inheritance 2 classes