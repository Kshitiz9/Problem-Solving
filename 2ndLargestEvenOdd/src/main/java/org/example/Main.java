package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int secondLargestEvenOdd(int[] arr){
        int largeEven = Integer.MIN_VALUE;
        int secondEven = Integer.MIN_VALUE;
        int smallOdd = Integer.MAX_VALUE;
        int secondOdd = Integer.MAX_VALUE;
        //for Odd
        for(int i = 1; i < arr.length; i += 2){
            if(smallOdd > arr[i]){
                secondOdd = smallOdd;
                smallOdd = arr[i];
            }else{
                secondOdd = Math.min(secondOdd, arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i += 2){
            if(largeEven < arr[i]){
                secondEven = largeEven;
                largeEven = arr[i];
            }else{
                secondEven = Math.max(secondEven, arr[i]);
            }
        }
        return secondOdd + secondEven;
    }
    static void main() {
        int[] arr = {1, 2, 5, 8, 9, 13, 16, 6, 34, 98};
        int ans = secondLargestEvenOdd(arr);
        System.out.print(ans);
    }
}
