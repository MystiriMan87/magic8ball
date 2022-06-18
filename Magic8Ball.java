
public class main {
    public static void main(String args[]) {
       String userInput = "";
        int max = 8;
        int min = 1;
        int range = max - min + 1;

        int rand = (int) (Math.random() * range) + min;
        switch (rand) {
            case 1:
                System.out.println("You will fail");
                break;
            case 2:
                System.out.println("You will succeed");
                break;
            case 3:
                System.out.println("You will be confused");
                break;
            case 4:
                System.out.println("You will soon find out");
                break;
            case 5:
                System.out.println("Do not attempt it");
                break;
            case 6:
                System.out.println("Secret");
                break;
            case 7:
                System.out.println("you might succeed");
                break;
            case 8:
                System.out.println("empty");
                break;
            default:
                System.out.println("Error 3");

        }
        
        if (rand == 6 || rand == 4){
            System.out.println("This is a secret message, if your reading this you will succeed");
        } 

        
    }
}
