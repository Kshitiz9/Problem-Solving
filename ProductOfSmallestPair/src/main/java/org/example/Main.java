package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int smallestProduct(int[] nums, int target){
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        if(nums.length <= 1){
            return -1;
        }
        for(int i = 0; i < nums.length; i++){
            if(min >= nums[i]){
                smin = min;
                min = nums[i];
            }else if(min < nums[i] && smin > nums[i]){
                smin = nums[i];
            }
        }
        if(min + smin > target){
            return -1;
        }
        return smin * min;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target ");
        int target = sc.nextInt();
        System.out.print("Enter the length of the array ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            System.out.print("Enter "+ (i + 1) + " element ");
            arr[i] = sc.nextInt();
        }
        int ans = smallestProduct(arr, target);
        System.out.print(ans);
    }
}
