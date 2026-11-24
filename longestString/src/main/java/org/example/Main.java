package org.example;

import java.util.Scanner;
public class Main {
    static int longString(String[] s, int n){
        int len = 0;
        for(int i = 0; i < n; i++){
            len = Math.max(len, s[i].length());
        }
        return len;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings");
        int n = sc.nextInt();

        String[] s = new String[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the string");
            s[i] = sc.next();


        }

        int result = longString(s, n);

        System.out.print(result);


        }
}

