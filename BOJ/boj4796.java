package BOJ;
import java.util.Scanner;

public class boj4796 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int cnt = 0;



        while (true) {
            cnt++;s
            int L = sc.nextInt();
            int P = sc.nextInt();
            int holiday = sc.nextInt();

            if (L == 0 && P == 0 && holiday == 0) break;
            int sum = L * (holiday / P) + Math.min(L, holiday% P);
            System.out.println("Case "+cnt+": "+sum);



        }
    }
}
