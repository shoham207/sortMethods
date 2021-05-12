import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int [] arr={5,89,27,54,0,771,2,18,34,90,52,11,24,7,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i; j>0 && arr[j]<arr[j-1];j--){
                swap(arr,j,j-1);
            }
        }
    }
    public static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
