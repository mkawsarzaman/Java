public class AddBorder {
    public static void main(String [] args){
        String[] textToBorder = {"abc",
                "def"};
        System.out.println(Bordering(textToBorder));
    }

    public static String[] Bordering(String[] picture) {
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
