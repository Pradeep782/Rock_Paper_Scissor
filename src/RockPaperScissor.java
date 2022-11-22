import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);


        if(userInput == computerInput){
            System.out.println("It's a draw game");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You have won the game");
        }else{
            System.out.println("Computer won the game");
        }

        
        if(computerInput == 0){
            System.out.println("THe choice made by the computer is Rock");
        } else if(computerInput == 1){
            System.out.println("THe choice made by the computer is Paper");
        } else if(computerInput == 2){
            System.out.println("THe choice made by the computer is Scissor");
        }


    }
}
