package BOJ;

import java.util.Scanner;

public class boj2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int[] arr = {25, 10, 5, 1};
        int tc = sc.nextInt();
        for(int i = 0;i<tc;i++){
            int money = sc.nextInt();
            for(int j = 0;j<arr.length;j++){
                //System.out.println(arr[j] + "|| " + money);
                while(money >= arr[j]){
                    money -= arr[j];
                    cnt++;
                }
                System.out.print(cnt+" ");
                cnt = 0;
            }
            System.out.println();
        }


    }

}
