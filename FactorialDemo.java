import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args){
        System.out.print("The number whose factorial is to be calculated ");
        Scanner input = new Scanner(System.in);
        int numberOfFactorial = input.nextInt();
        System.out.println("The factorial of " + numberOfFactorial + " is " + factorial(numberOfFactorial));
    }
    public static int factorial(int numberOfFactorial){
        if(numberOfFactorial == 1){
            return numberOfFactorial;
        } else{
            return numberOfFactorial * factorial(numberOfFactorial-1);
        }
    }
}
