import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args){
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String userName = input.next();
        System.out.print("Hi " + userName + ", which option do you choose? (O)dds or (E)vens? ");
        String option = input.next();

        if (option.equalsIgnoreCase("O")) {
            System.out.println(userName + " has picked odds! The Computer will be evens.");
        } else if (option.equalsIgnoreCase("E")) {
            System.out.println(userName + " has picked evens! The computer will be odds.");
        } else {
            System.out.println(userName + " , please choose either \"O\" or \"E\"");
        }
        String space = "---------------------------------------";
        System.out.println(space);

        System.out.print("How many \"fingers\" do you put out? ");
        int userFinger = input.nextInt();
        Random rand = new Random();
        int computerFinger = rand.nextInt((5-1)+1)+1;
        System.out.println("The computer plays " + computerFinger + " \"fingers\"");
        System.out.println(space);
        int sum = userFinger + computerFinger;
        System.out.println(userFinger + " + " + computerFinger + " = " + sum);
        boolean oddOrEven = sum % 2 == 0;
        if(oddOrEven){
            System.out.println(sum + " is ... even");
            if(option.equalsIgnoreCase("E")){
                System.out.println("That means " + userName + " wins! :)");
            } else{
                System.out.println("That means computer wins! :(");
            }
        } else{
            System.out.println(sum + " is ... odd");
            if(option.equalsIgnoreCase("E")){
                System.out.println("That means computer wins! :(");
            } else {
                System.out.println("That means " + userName + " wins! :)");
            }
        }
        System.out.println(space);
        }
        
}
