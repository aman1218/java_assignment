package Assgn2;
public class q2 {
    public static void bubble_sort(int arr[],int n){
        int i,j,temp;
        for (i=0; i< n - 1; i++){
            for (j=0; j< n - i - 1; j++){
                if (arr[j]> arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    
    public static void main(String [] args){
        int[] array={6,0,3,5,1};
        int len;
        len=array.length;
        bubble_sort(array,len);
        System.out.println("Sorted array: ");
        printArray(array,len);
    }
}
