/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practice1;

/**
 *
 * @author Pablo
 */

import java.util.Scanner;

public class Practice1 {
    
    public static int[] bubble_sort(int[] nums){
       
        while(true){
            int nums_swaps = 0; 
            
            for (int index = 0; index < (nums.length - 1); index++){
                
                if (nums[index] > nums[index+1]){
                    nums_swaps++;
                    int temp_int = nums[index];
                    nums[index] = nums[index+1];
                    nums[index+1] = temp_int;
                }
            }
            if (nums_swaps == 0){
                break;
            }
            
        }
        return nums;
    }
    
    public static void print_list(int[] nums){
        System.out.print("[");
        for (int x = 0; x < nums.length; x++){
            if (x != (nums.length - 1)){
                System.out.print(nums[x] + ", ");
            }
            else{
                System.out.print(nums[x] + "]");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many number will be in your list?: ");
        int num = s.nextInt();
        
        int[] my_list = new int[num];
        for (int x = 0; x < num; x++){
            System.out.print("Write your number " + Integer.toString(x+1) + ": ");
            my_list[x] = s.nextInt();
        }
        
        int[] my_list2 = bubble_sort(my_list);
        print_list(my_list2);
          
    }
}

