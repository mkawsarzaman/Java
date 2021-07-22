import java.util.Scanner;

public class TextNormalizing {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your Text ");
        String text = input.nextLine();
        System.out.println("Your text input is " +text);
        String convertedText =  normalizeText(text);
        System.out.println("Normalized text is " +convertedText);

    }
    public static String normalizeText( String text){
        String removedSpaceAndPunctuations = text.replaceAll("[\\p{Punct}\\s]", ""); // (\\p{Punct} for removing punctuations, \\s for space)
        return removedSpaceAndPunctuations.toUpperCase();
    }
}
