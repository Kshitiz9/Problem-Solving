package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int minimumHouse(int[] houses, int rats, int rat_capacity){
        int minimum = Integer.MAX_VALUE;
        int total_capacity = rats * rat_capacity;
        int sum = 0;
        int left = 0;
        for(int right = 0; right < houses.length; right++){
            sum += houses[right];
            while(sum >= total_capacity){
                minimum = Math.min(minimum, right - left + 1);
                sum -= houses[left];
                left++;
            }
        }
        if(minimum == Integer.MAX_VALUE){
            return -1;
        }else{
            return minimum;
        }

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of rats");
        int rats = sc.nextInt();
        System.out.print("Enter what amount each rat can consume");
        int rat_capacity = sc.nextInt();
        System.out.print("Enter total number of houses you want");
        int house_numbers = sc.nextInt();
        int [] houses = new int[house_numbers];
        for(int i = 0; i < house_numbers; i++){
            System.out.print("Enter " + (i + 1) + " house capacity");
            houses[i] = sc.nextInt();
        }
        int ans = minimumHouse(houses, rats, rat_capacity);
        System.out.print("Minimum houses required is " + ans);
    }
}
