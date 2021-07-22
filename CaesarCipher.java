import java.util.*;

public class CaesarCipher {
    public static void main(String[] args){
        System.out.print("Input your Text to be ciphered ");
        Scanner input = new Scanner(System.in);
        String textToBeCiphered = input.nextLine();
        System.out.println("The text you have input is " + textToBeCiphered);
        System.out.print("Input the shift parameter ");
        int shift = input.nextInt();
        String cipheredText = Caesarify(textToBeCiphered,shift);
        System.out.println(cipheredText);
    }

    public static String Caesarify(String textToBeCiphered, int shift){
        String shiftedWholeAlphabet = shiftAlphabet(shift);
        shiftedWholeAlphabet = textToBeCiphered.replace(textToBeCiphered,shiftedWholeAlphabet);
        return shiftedWholeAlphabet;
    }
}
