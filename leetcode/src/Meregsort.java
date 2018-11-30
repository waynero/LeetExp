import java.util.Random;

public class Meregsort {
    public static void quicksort(int[] arr){
        helper(arr, 0, arr.length - 1);
    }
    private static void helper(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        Random rand = new Random();
        int pivot = left + rand.nextInt(right - left + 1);
        swap(arr, pivot, right);
        int l = left;
        int r = right - 1;
        while(l <= r){
            if(arr[l] < arr[right]){
                l++;
            }else{
                swap(arr, l, r);
                r--;
            }
        }
        swap(arr, l, right);
        helper(arr, left, l - 1);
        helper(arr, l + 1, right);
    }
    private static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }


    public static void mergesort(int[] arr){
        helper2(arr, 0, arr.length - 1, new int[arr.length]);
    }
    private static void helper2(int[] arr, int left, int right, int[] help){
//        if(left > )
    }

    public static void main(String[] args){
        int[] arr = {3,1,6,2,4,8,9};
        quicksort(arr);
        for(int each : arr){
            System.out.println(each);
        }
    }
}
