package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int CarryCount(int i, int j){
        int carry = 0;
        int carryCount = 0;
        while(i > 0 || j > 0){
            int sum = i % 10 + j % 10 + carry;
            carry = sum / 10;
            if(carry > 0){
                carryCount++;
            }
            i = i / 10;
            j = j / 10;
        }
        return carryCount;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number ");
        int i = sc.nextInt();
        System.out.print("Enter 2nd number ");
        int j = sc.nextInt();
        int ans = CarryCount(i, j);
        System.out.print("The total carry count is " + ans);
    }
}
