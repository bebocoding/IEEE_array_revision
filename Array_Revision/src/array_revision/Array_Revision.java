package array_revision;

public class Array_Revision {

    public static void main(String[] args) {
        Array arr = new Array(15);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        
        arr.prob2(2,88);
        arr.printArray();
    }
    public static void recArrayRotate(int[] arr,int n){
        if(n>=1){
        int temp = arr[arr.length-1];
        int i;
        for(i =arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[i] = temp;
        recArrayRotate(arr,n-1);
        }
        return;
        
    }
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
