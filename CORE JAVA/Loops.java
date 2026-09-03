public class Loops {
    public static void main(String[] args) {
        
        // (while, do-while, for)


       int i = 1;

       while(i <= 5){
        System.out.println("Hi" + i);
        int j = 1;
        while (j <= 3){
            System.out.println("Hello" + j);
            j++;
        }
        i++;
       }
       System.out.println("Bye" + i);


    //    do{
    //         System.out.println("Hi" + i);
    //         i++;

    //    }while(i <= 5);

       for(int n=1; n<=5; n++)
       {
            System.out.println("Day " + n);

            // for(int j=1; j<=9; j++){
            //     System.out.println(" " + (j+8));
            // }
            

       }

       

    }
    
}
