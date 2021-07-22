import java.util.Scanner;

public class FibonacciDemo {
    public static void main (String[] args){
        System.out.print("Up to how many numbers do you need the series? ");
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        for (int i = 0; i< numberOfElements; i++){
            System.out.print(FibonacciRecursion(i) + " ");
        }

    }

    public static int FibonacciRecursion(int numberOfElements){
        if(numberOfElements == 0){
            return 0;
        } else if(numberOfElements == 1 || numberOfElements ==2){
            return 1;
        } else{
            return FibonacciRecursion(numberOfElements-1) + FibonacciRecursion(numberOfElements-2);
        }
    }
}
