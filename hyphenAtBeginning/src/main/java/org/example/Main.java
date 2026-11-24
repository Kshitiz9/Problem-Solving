package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static String hyphensAtBeginning(String s){
        char[] arr = s.toCharArray();
        int left  = 0;
        int right = 0;
        int curr = 0;
        while(right < arr.length){
            while(right < arr.length && arr[right] != '-'){
                right++;
            }
            if(right < arr.length && arr[right] == '-'){
                curr = right;
                while(curr > 0){
                    left = curr - 1;
                    swap(arr, left, curr);
                    curr--;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static void swap(char[] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Characters with hyphens");
        String s = sc.next();
        String ans = hyphensAtBeginning(s);
        System.out.print(ans);
    }
}
