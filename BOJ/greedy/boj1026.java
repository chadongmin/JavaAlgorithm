package BOJ.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class boj1026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] a = new int[tc];
        int[] b = new int[tc];
        int sum = 0;
        for(int i = 0 ;i < tc;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0 ;i < tc;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);


        for (int i = 0;i<tc;i++){
            sum += a[i] * b[b.length-(1+i)];
        }
        System.out.println(sum);

    }
}
