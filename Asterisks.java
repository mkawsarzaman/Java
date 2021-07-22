public class Asterisks {
    public static void main(String[] args) {
        String[] textToBorder = {"abc",
                "ded"};
        System.out.println(addBorder(textToBorder));
    }

    static String[] addBorder(String[] picture) {
        String[] bordered = new String[picture.length+2];
        String borders = "";
        for(int i = 0; i < picture[0].length()+2;i++) {
            borders += "*";
        }
        bordered[0] = borders;
        bordered[bordered.length-1] = borders;
        for(int i = 0;i < picture.length;i++) {
            bordered[i+1] = "*" + picture[i] + "*";
        }
        return bordered;
    }
}
