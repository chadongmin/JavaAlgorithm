package SWExpert;
import java.util.*;

public class sw1945 {
    /*
     숫자 N은 아래와 같다.
     N=2a x 3b x 5c x 7d x 11e
     N이 주어질 때 a, b, c, d, e 를 출력하라.
    */
    static int num = 0;
    public static void main(String[] args) {
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int test_case = sc.nextInt();
        for(int i = 1;i<=test_case;i++){

            num = sc.nextInt();
            while(num % 2 == 0){

                num/=2;
                cnt++;
            }
            System.out.print("#"+ i +" ");
            System.out.print(cnt+" ");
            cnt = 0;
            while(num % 3 == 0){

                num/=3;
                cnt++;
            }
            System.out.print(cnt+" ");
            cnt = 0;

            while(num % 5 == 0){

                num/=5;
                cnt++;
            }
            System.out.print(cnt+" ");
            cnt = 0;

            while(num % 7 == 0){

                num/=7;
                cnt++;
            }
            System.out.print(cnt+" ");
            cnt = 0;

            while(num % 11 == 0){

                num/=11;
                cnt++;
            }
            System.out.print(cnt+" \n");
            cnt = 0;
        }
    }

}
