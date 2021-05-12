import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr={5,89,27,54,0,771,2,18,34,90,52,11,24,7,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int [] mergeSort(int [] arr){
        if (arr.length<=1)
            return arr;
        int [][] hnh=split(arr);
        hnh[0]=mergeSort(hnh[0]);
        hnh[1]=mergeSort(hnh[1]);
        return merge(hnh[0],hnh[1]);
    }
    public static int [][] split(int [] arr){
        int [][] hnh=new int[2][];
        hnh[0]=new int[arr.length/2];
        hnh[1]=new int[arr.length-hnh[0].length];
        int i=0;
        while (i<arr.length/2){
            hnh[0][i]=arr[i];
            i++;
        }
        while (i<arr.length){
            hnh[1][i-hnh[0].length]=arr[i];
            i++;
        }
        return hnh;
    }
    public static int [] merge(int [] arr1, int [] arr2){
        int a1=0;
        int a2=0;
        int [] arr=new int[arr1.length+ arr2.length];
        while (a1<arr1.length && a2<arr2.length){
            if (arr1[a1]<arr2[a2]){
                arr[a1+a2]=arr1[a1];
                a1++;
            }
            else {
                arr[a1+a2]=arr2[a2];
                a2++;
            }
        }
        while (a1< arr1.length){
            arr[a1+a2]=arr1[a1];
            a1++;
        }
        while (a2< arr2.length){
            arr[a1+a2]=arr2[a2];
            a2++;
        }
        return arr;

    }
    public static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
