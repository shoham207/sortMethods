import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr={5,89,27,54,0,771,2,18,34,90,52,11,24,7,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int [] arr){
        for(int i=1; i<arr.length-1; i++){
            for (int j=0;j<arr.length-i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    public static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
