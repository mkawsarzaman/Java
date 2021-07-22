import java.util.Scanner;

public class Groupify {
    public static void main(String[] args){
        System.out.print("Enter size to make code groups: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int groupSize = input.nextInt();
        String codeGroupedString = Groupify(text, groupSize);
        System.out.println(codeGroupedString);
    }

    public static String Groupify(String inputText, int numberofGroups){
        if (numberofGroups == 0) {
            return inputText;
        }
        String groupedString = "";
        int length = inputText.length();
        int iteration = 0;
        String temporaryString = "";
        for (int i = 0; i < length; i++) {
            char c = inputText.charAt(i);
            if (iteration ==numberofGroups) {
                groupedString += ' ';
                iteration = 0;
                temporaryString = "";
            }
            groupedString += c;
            iteration++;
            temporaryString += c;
        }
        // Add additional x's
        if (temporaryString.length() != numberofGroups) {
            for (int i = temporaryString.length(); i < numberofGroups; i++) {
                groupedString += 'x';
            }
        }
        return groupedString;
    }
}
