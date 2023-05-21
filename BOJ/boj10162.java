package BOJ;

import java.util.Scanner;

public class boj10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] btn  ={300, 60, 10};
        int time = sc.nextInt();
        int [] result = new int [3];

            for(int i = 0;i<btn.length;i++) {
                while (time >= btn[i]) {
                    time-=btn[i];
                    result[i]++;
                }
            }
            if (time == 0){
                for(var r : result){
                    System.out.print(r+" ");
                }
            }
            else System.out.println("-1");



    }
}
