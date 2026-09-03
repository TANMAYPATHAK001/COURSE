public class Type_Conversion_and_Casting {
    
public static void main(String[] args) {
    
    byte b = 127;
    int a  = 12;

    // if the value is bigger than the range then modulo will arrive.

      // b = a; (Wrong)   // b = (byte)a; -> CASTING
      // a = b; (Right) -> CONVERSION

    float f = 5.6f;
    int i = (int)f;

      // Type Promotion (Out of range then promote)
      byte x = 10;
      byte y = 30;

      int result = a * b;
      System.out.println(result);
}
}
