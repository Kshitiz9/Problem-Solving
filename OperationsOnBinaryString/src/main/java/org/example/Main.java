package org.example;

import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int OperationOnBinaryString(String s){
       int ans = s.charAt(0) - '0';
       for(int i = 1; i < s.length(); i += 2){
           int operand = s.charAt(i + 1) - '0';
           char operator = s.charAt(i);
           switch(operator){
               case 'A' :
                   ans = ans & operand;
                   break;
               case 'B' :
                   ans = ans | operand;
                   break;
               case 'C' :
                   ans = ans ^ operand;
                   break;
           }
       }
       return ans;
    }
    static void main(String[] args) {
        String s = "1C0B1B0A1B0";
        int ans = OperationOnBinaryString(s);
        System.out.print(ans);
    }
}
