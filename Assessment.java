import java.util.Scanner;

public class Assessment {
/*    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int output = puzzle(i,j);
        System.out.println(output);
    }*/

    public static int someCode(int a, int b, int c){
        if((a<b) && (b<c)) {
            return a;
        }
        if((a>=b) && (b>=c)) {
            return b;
        }
        if((a==b) || (a==c) || (b==c)) {
            return c;
        }
    }
}