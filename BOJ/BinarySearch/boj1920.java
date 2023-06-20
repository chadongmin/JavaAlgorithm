package BOJ.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class boj1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for(int i = 0; i< tc;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int num = sc.nextInt();
        for (int i = 0; i< num; i++){
            int low = 0;
            int high = arr.length-1;
            int key = sc.nextInt();
            int ans = 0;

            while(low <= high){
                int mid = (low + high) / 2;
                if (arr[mid] == key){
                    ans = 1;
                    break;
                }
                if (arr[mid] > key){
                    high = mid -1;
                }else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
