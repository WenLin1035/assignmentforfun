package Strings;

import java.util.Locale;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String ans = string2.concat(string1);
        return ans;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        String ans = " ";
        String space = " ";
        if(string.length() == 0){
            return "";
        }
        if(string.length() == 1){
            return " ";
        }
        for (int i =0;i<string.length()-1;i++){
            ans += space;
        }
        return ans;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        char[] letters = string.toCharArray();
        for(int i = 0; i< letters.length;i++){
            if(Character.isUpperCase(letters[i])){
                letters[i] = Character.toLowerCase(letters[i]);
            }else if(Character.isLowerCase(letters[i])){
                letters[i] = Character.toUpperCase(letters[i]);
            }
        }
        return String.valueOf(letters);
    }

    public String oneAtATime(String string1, String string2) {
        String temp = "";
        if(string1.length()<string2.length()){
            for(int i =0;i<string1.length();i++){
                temp += String.valueOf(string1.charAt(i)) + String.valueOf(string2.charAt(i));
            }
            for(int i = string1.length();i<string2.length();i++){
                temp += String.valueOf(string2.charAt(i));
            }
            return temp;
        }else if(string1.length()>string2.length()){
            for(int i =0;i<string2.length();i++){
                temp += String.valueOf(string1.charAt(i)) + String.valueOf(string2.charAt(i));
            }
            for(int i = string2.length();i<string1.length();i++){
                temp += String.valueOf(string1.charAt(i));
            }
            return temp;
        }else{
            for(int i =0;i<string2.length();i++){
                temp += String.valueOf(string1.charAt(i)) + String.valueOf(string2.charAt(i));
            }
            return temp;
        }
    }
}
