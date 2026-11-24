package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }
    static void main() {
        String s = "advgGOtyMnhIIjmnh";
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            if(!isVowel(s.charAt(i))){
                len++;
            }
        }
        System.out.print(len);
    }
}
