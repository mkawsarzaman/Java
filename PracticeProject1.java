import java.util.Scanner;
public class PracticeProject1 {
    public static void main(String[] args){
        System.out.println("Welcome to vacation planner!");
        System.out.print("what's your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("nice to meet you" + " " + name + ", "+ "where are you travelling to? ");
        String name1 = input.nextLine();
        System.out.println("great! " + name1 + " sounds like a great trip");
        System.out.println("**************\n");
        TravelTimeBudget();
        TimeDifference();
        SquareArea();
    }
    public static void TravelTimeBudget(){
        System.out.print("How many days are you going to spend travelling? ");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        int hours = days*24;
        int minutes = hours*60;
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextDouble();
        double moneyPerDay1 = money/days;
        double moneyPerDay2 = moneyPerDay1*100;
        int moneyPerDay3 = (int)moneyPerDay2;
        double moneyPerDay = (double)moneyPerDay3/100;
        System.out.print("what is the three letter currency symbol? ");
        String currency = input.next();
        System.out.print("How many MXC are there in 1 USD? ");
        double conversion = input.nextDouble();
        double currencyInMxc = money*conversion;
        double currencyInMxcPerDay1 = currencyInMxc/days;
        double currencyInMxcPerDay2 = currencyInMxcPerDay1*100;
        int currencyInMxcPerDay3 = (int)currencyInMxcPerDay2;
        double currencyInMxcPerDay = (double)currencyInMxcPerDay3/100;
        System.out.println("\nIf you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" + moneyPerDay + " USD");
        System.out.println("Your total budget in MXC is " + currencyInMxc + " MXC, which per day is " + currencyInMxcPerDay + " MXC");
        System.out.println("**************\n");
    }
    public static void TimeDifference(){
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Scanner input = new Scanner (System.in);
        int timeDifference = input.nextInt();
        int destinationTimeMidnight = (24 + timeDifference) % 24;
        int destinationTimeNoon = 12 + timeDifference % 24;
        System.out.println("That means that when it is midnight at home it will be " + destinationTimeMidnight + ":00 in your travel destination and when it is noon at home it will be " + destinationTimeNoon + ":00");
        System.out.println("**************\n");
    }
    public static void SquareArea(){
        System.out.print("What is the square area of your destination country in km2? ");
        Scanner input = new Scanner(System.in);
        int areaInKm2 = input.nextInt();
        double areaInMile2_1 = areaInKm2 * 0.3861;
        double areaInMile2_2 = areaInMile2_1*100;
        int areaInMile2_3 = (int) areaInMile2_2;
        double areaInMile2 = (double)areaInMile2_3/100;
        System.out.println("In miles2 that is " + areaInMile2);
        System.out.println("**************\n");
    }
}
