package BOJ.greedy;


import java.util.Arrays;
import java.util.Scanner;

public class boj11399 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for(int i = 0;i< tc;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int sum = 0;
        int prefix = 0;
        for (int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
            prefix+=sum;
            //System.out.println(sum);
        }
        System.out.println(prefix);


    }
}
