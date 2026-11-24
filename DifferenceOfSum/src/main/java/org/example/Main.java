package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int DifferenceOfSum(int n, int m){
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= n; i++){
            if(i % m != 0){
                sum1 = sum1 + i;
            }
        }
        for(int i = 1; i <= n; i++){
            if(i % m == 0){
                sum2 += i;
            }
        }
        return sum1 - sum2;
    }
    static void main() {
        int n = 12;
        int m = 4;
        int ans = DifferenceOfSum(n , m);
        System.out.print(ans);
    }
}
