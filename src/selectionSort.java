import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int [] arr={5,89,27,54,0,771,2,18,34,90,52,11,24,7,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int [] arr){
        for (int i=0; i<arr.length-1;i++){
            swap(arr,i,findMinIndex(arr,i, arr.length));
        }
    }

    public static int findMinIndex(int [] arr,int i, int j){
        int minIndex=i;
        for (int k=i;k<j;k++){
            if (arr[k]<arr[minIndex])
                minIndex=k;
        }
        return minIndex;
    }

    public static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
