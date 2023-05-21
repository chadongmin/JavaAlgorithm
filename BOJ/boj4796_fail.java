package BOJ;
import java.util.Scanner;

public class boj4796_fail {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int sum = 0 ;
        int cnt = 0;

        while(true){
            cnt++;
            int L = sc.nextInt();
            int P = sc.nextInt();
            int holiday = sc.nextInt();

            if (L == 0 && P == 0 && holiday == 0) break;

            while(holiday > P) {
                holiday -= P;
                sum += L;
            }
            //System.out.println(holiday);
            if (holiday>L){
                while(holiday > L){
                    holiday-=L;
                    sum+=L;
                }
            }
            sum+=holiday;

            System.out.println("Case "+cnt+": "+sum);
            sum = 0;
        }
    }
}
