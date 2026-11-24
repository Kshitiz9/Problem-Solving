package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int minimumSubArray(int[] arr, int target){
        int len = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < arr.length; right++){
            sum += arr[right];
            while(sum >= target){
                len = Math.min(len, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
    static void main(String[] args) {
        int[] arr = {10, 24, 10, 7, 46, 5};
        int target = 51;
        int ans = minimumSubArray(arr, target);
        System.out.print(ans);
    }
}
