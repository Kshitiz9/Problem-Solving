package org.example;

import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int len = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            len = Math.max(len, right - left + 1);
        }
        return len;
    }
    static void main(String[] args) {
        String s = "pewwwkewbvppp";
        int ans = longestSubstring(s);
        System.out.print(ans);
    }
}
