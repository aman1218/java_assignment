package Assgn2;

public class q3 {
    public static int largest(int arr[], int n){
        int i,max=0;
        for (i=0;i<n-1;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest element:"+max);
        return max;
    }
    public static int smallest(int arr[], int n){
        int i,min=0;
        for (i=0;i<n-1;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("smallest element:"+min);
        return min;
    }

    public static void main(String[] args){
        int[] array = {0,6,9,2,4};
        int len = array.length;
        largest(array, len);
        smallest(array, len);

    }
    
}
