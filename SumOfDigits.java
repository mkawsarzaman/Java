import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.print("Input the two digit Integer ");
        Scanner input = new Scanner (System.in);
        int integer = input.nextInt();
        int a = integer/10;
        int b = integer%10;
        int sum = a + b;

        System.out.println("The Sum is " + sum);
    }
}
