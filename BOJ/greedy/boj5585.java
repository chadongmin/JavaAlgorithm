package BOJ.greedy;
import java.util.*;
/*
* 아이디어: 거스름돈 배열을 리터럴로 선언하고
* for문으로 루프를 안에 while문에서 돈이 거스름돈보다 작아질떄까지
* 반복해서 뺀다.
*
* */
public class boj5585 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int cnt = 0;
        input= 1000 - input;
        int [] arr = {500, 100, 50, 10, 5, 1};

        for(int i = 0;i<arr.length;i++){
            while (input>=arr[i]){

                input = input - arr[i];
                cnt++;
            }
        }
        System.out.println(cnt);


        //System.out.println(input);

    }
}
