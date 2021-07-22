import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Does Player one selects rock, paper or scissors? ");
        String player1 = input.nextLine();
        System.out.print("Does Player two selects rock, paper or scissors? ");
        String player2 = input.nextLine();

        if((player1.equals("rock") && player2.equals("scissors")) || (player1.equals("scissors") && player2.equals("paper")) || (player1.equals("paper") && player2.equals("rock"))){
            System.out.println("player 1 wins");
        } else if ((player2.equals("rock") && player1.equals("scissors")) || (player2.equals("scissors") && player1.equals("paper")) || (player2.equals("paper") && player1.equals("rock"))){
            System.out.println("player 2 wins");
        } else{
            System.out.println("tie!");
        }

        /*
        if(player1.equals("rock")){
            if(player2.equals("scissors")){
                System.out.println("player 1 wins");
            } else if(player2.equals("paper")){
                System.out.println("player 2 wins");
            } else{
                System.out.println("tie!");
            }
        } else if (player1.equals("paper")){
            if(player2.equals("scissors")){
                System.out.println("player 2 wins");
            } else if(player2.equals("rock")){
                System.out.println("player 1 wins");
            } else{
                System.out.println("tie");
            }
        } else{
            if(player2.equals("scissors")){
                System.out.println("tie");
            } else if(player2.equals("rock")){
                System.out.println("player 2 wins");
            } else{
                System.out.println("player 1 wins");
            }
        }

         */
    }

}
