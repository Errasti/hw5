import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] taskArray = new int[]{30, 50, 23, 11, 3, 5};
        HeapSort(taskArray);
        System.out.println(Arrays.toString(taskArray));
    }
    public static void HeapSort(int[] arr){
        int n = arr.length;
        for(int i = n / 2 - 1; i >= 0; i--){
           heapify(arr, n, i);
        }
        for (int j = n - 1; j >= 0; j--){
            int temp = arr[0];
            arr[0] = arr[j];
            arr[j] = temp;
            heapify(arr, j, 0);
        }
    }
    public static void heapify(int[] arr, int n, int i){
        int max = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if ( left < n && arr[left] > arr[max]){
            max = left;
        }
        if (right < n && arr[right] > arr[max]){
            max = right;
        }
        if (max != i){
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            heapify(arr, n, max);
        }

    }
}
