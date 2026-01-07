import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

  private static String[] choices = { "Rock", "Paper", "Scissors" };

  public static void main (String[] args){
  
     Scanner scan = new Scanner(System.in);
     Random rGen = new Random();


     String name;
     int playerChoiceNum;
     String playerChoice;

     int computerChoiceNum;
     String computerChoice;

     char tryAgain;
     String playerMessage="";

     System.out.print("What is your name? ");
     name = scan.nextLine();
     System.out.println();

     do {
       System.out.print("1 = Rock\n2 = Paper\n3 = Scissors\nPlease choose 1, 2, or 3: ");
       playerChoiceNum = scan.nextInt(); scan.nextLine();
       playerChoice = choices[playerChoiceNum - 1];
       System.out.println();


       computerChoiceNum = Math.abs(rGen.nextInt()) % 3 + 1;
       computerChoice = choices[computerChoiceNum - 1];


       System.out.println(name + ", are you SURE you want to choose " + playerChoice + "?(Yes or No)");
       tryAgain=scan.next().charAt(0);
       tryAgain=Character.toLowerCase(tryAgain);
     }while(tryAgain!='y');


     System.out.printf("%s, you chose %s.%n", name, playerChoice);
     System.out.printf("The computer chose %s.%n", computerChoice);
     System.out.println();


     if(playerChoice == computerChoice)
     {
       System.out.println("It is a tie!");
       System.exit(0);
     } 
     else
     {

       switch (playerChoice){
         case "Rock":
           if (computerChoice=="Scissors")
         {
           System.out.print("Rock breaks Scissors\n");
           playerMessage="Player wins!";
         }
           else
           { 
             System.out.print(computerChoice+" beats Rock\n");
             playerMessage="Player loses!";
           }
           break;

         case "Paper":
           if (computerChoice=="Rock")
         { 
           System.out.print("Paper wraps Rock\n");
           playerMessage="Player wins!";
         }
           else
           {
             System.out.print(computerChoice+" beats Paper\n");
             playerMessage="Player loses!"; 
           } 
           break;

         case "Scissors":
           if (computerChoice=="Paper")
         {
           System.out.print("Scissors Cuts Paper\n");
           playerMessage="Player wins!";
         }
           else
           {
             System.out.print(computerChoice+" beats Scissors\n");
             playerMessage="Player loses!";

           } 
           break;

       }
     } 
     System.out.println(playerMessage);

  }

}