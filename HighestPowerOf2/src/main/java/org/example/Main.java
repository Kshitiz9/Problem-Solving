package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int HighestPowerOf2(int[] arr){
        int maxexpo = -1;
        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int curr = arr[i];
            while(curr % 2 == 0){
                count++;
                curr /= 2;
            }
            if(count > maxexpo){
                maxexpo = count;
                ans = arr[i];
            }
        }
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {10, 20, 32, 16, 64, 134, 268};
        int ans = HighestPowerOf2(arr);
        System.out.print(ans);
    }
}
