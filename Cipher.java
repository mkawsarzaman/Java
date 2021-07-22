import com.sun.source.tree.CaseTree;

import java.util.*;

public class Cipher {
    public static void main(String[] args){
        String text = "This is some message";
        String ciphery = Caesarify(text,5);
        System.out.println(ciphery);

    }

    public static String Caesarify(String inputText, int shift){
        if(shift>26){
            shift = shift%26;
        } else if(shift<0){
            shift = (shift%26)+26;
        }else{
            shift = shift;
        }

        String cipherText = "";
        int length = inputText.length();
        for(int i=0; i<length; i++){
            char ch = inputText.charAt(i);
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
        return cipherText;
    }
}
