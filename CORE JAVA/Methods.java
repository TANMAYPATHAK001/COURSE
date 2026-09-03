class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }

    public String getMeAPen(int cost){
        if (cost>=10) {
            return "Pen";
        }
        return "Nothing";

        // else{
        //     return "Nothing";
        // }
        
    }
}

public class Methods {
    public static void main(String[] args) {
        
        Computer computer = new Computer();

        computer.playMusic();
        String str = computer.getMeAPen(10);
        System.out.println(str);


    }
}
