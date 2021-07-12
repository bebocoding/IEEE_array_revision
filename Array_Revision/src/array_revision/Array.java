package array_revision;

public class Array {
    int[] arr;
    int maxSize;
    int nElems;
    
    public Array(int size){
        maxSize = size;
        arr = new int[maxSize];
        nElems = 0;
    }
    public void insert(int value){
        arr[nElems++] = value;
    }
    public  void prob1(int n){
        if(n>=1){
        int temp = arr[nElems-1];
        int i;
        for(i =nElems-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[i] = temp;
        prob1(n-1);
        }
        return;
        
    }
    public void prob2(int k,int value){
        for(int i =nElems;i>k;i--){
            arr[i] = arr[i-1];
        }
        arr[k] = value;
        nElems++;
        for(int j =nElems-k;j<nElems-1;j++){
            arr[j] = arr[j+1];
        }
        nElems--;
    }
    public  void printArray(){
        for(int i=0;i<nElems;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
