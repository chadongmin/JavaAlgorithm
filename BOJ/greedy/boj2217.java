package BOJ.greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class boj2217 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        Integer[] arr = new Integer[tc];
        for(int i = 0;i<tc;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            max = Math.max(max, arr[i] * (tc - i));
        }
        System.out.println(max);


    }
}
