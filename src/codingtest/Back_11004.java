package codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back_11004 {

    public static void quickSort(int[] arr,int start,int end){
        int part2 = partition(arr,start,end);
        if (start < part2 - 1){
            quickSort(arr,start,part2 -1);
        }
        if (part2 < end){
            quickSort(arr,part2,end);
        }
    }

    public static int partition(int[] arr,int start, int end){
        int pivot = (int) arr[(start+end)/2];
        while (start <= end){
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start<= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr,int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N =Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());

        }

        quickSort(arr,0,arr.length-1);

        System.out.println(arr[K-1]);




    }
}
