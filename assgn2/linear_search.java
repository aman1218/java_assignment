package Assgn2;

import java.util.Scanner;

public class linear_search {
    public static void main(String [] args){
        int arr[]={5,8,23,14};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to be searched: ");
        int val = sc.nextInt();
        int n = arr.length;

        Linear_search(arr, val, n);
    } 

    static int Linear_search(int arr[], int value,int n){
        for ( int i = 0;i<n;i++){
            if (arr[i] == value){
                System.out.println("Elemment found at index:" + i);
                return i;
            }
        }
        System.out.println("Element not present");
        return -1; 
    }
}
