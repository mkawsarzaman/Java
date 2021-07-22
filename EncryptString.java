import java.util.*;

public class EncryptString {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input your Text ");
        String inputText = input.nextLine();
        System.out.print("What is the shift parameter? ");
        int shift = input.nextInt();
        System.out.print("How many number of characters you want in the group? ");
        int groupSize = input.nextInt();
        String convertedText =  encryptString(inputText,shift,groupSize);
        System.out.println("Encrypted text is " +convertedText);

    }

    public static String encryptString(String inputText, int shift, int groupSize){
        String removedSpaceAndPunctuations = inputText.replaceAll("[\\p{Punct}\\s]", ""); // (\\p{Punct} for removing punctuations, \\s for space)
        removedSpaceAndPunctuations = removedSpaceAndPunctuations.toUpperCase();
        if(shift>26){
            shift = shift%26;
        } else if(shift<0){
            shift = (shift%26)+26;
        }else{
            shift = shift;
        }

        String cipherText = "";
        int length = removedSpaceAndPunctuations.length();
        for(int i=0; i<length; i++){
            char ch = removedSpaceAndPunctuations.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isLowerCase(ch)){
                    char c = (char)(ch+shift);
                    if(c>'z'){
                        cipherText+= (char)(ch - (26-shift));
                    }else{
                        cipherText+=c;
                    }
                }else if(Character.isUpperCase(ch)){
                    char c = (char)(ch+shift);
                    if(c>'Z'){
                        cipherText+= (char)(ch - (26-shift));
                    }else{
                        cipherText+=c;
                    }
                }
            }else{
                cipherText+=ch;
            }
        }
        if (groupSize == 0) {
            return removedSpaceAndPunctuations;
        }
        String groupedString = "";
        int iteration = 0;
        String temporaryString = "";
        for (int i = 0; i < length; i++) {
            char c = cipherText.charAt(i);
            if (iteration == groupSize) {
                groupedString += ' ';
                iteration = 0;
                temporaryString = "";
            }
            groupedString += c;
            iteration++;
            temporaryString += c;
        }
        // Add additional x's
        if (temporaryString.length() != groupSize) {
            for (int i = temporaryString.length(); i < groupSize; i++) {
                groupedString += 'x';
            }
        }
        return groupedString;
    }
}
