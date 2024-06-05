class BinarySearch{
    public int binary(int arr[],int lr, int up, int val){
        while(lr<=up){
            int mid = (lr+up)/2;
            if(arr[mid]==val){
                return mid;
            }
            else if (arr[mid]>val){
                up=mid - 1;
            }
            else {
                lr=mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {1,8,7,87,45};
        int n = arr.length;
        int x = 7;
        BinarySearch ob = new BinarySearch();
        int res = ob.binary(arr, 0, n - 1,x);
        if (res == -1){
            System.out.println("Element not present");
        }else
                System.out.println("Element found at index "
                                   + res);
        }
}