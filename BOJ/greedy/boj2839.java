package BOJ.greedy;
import java.util.Scanner;

/* 풀이방법 :
일단 5로 나눠지면 무조건 그 몫이 답이된다.
while문을 통해서 루프를 계속 돌면서 5로 나눠떨어지는지 check해야한다.
첫번째 조건문에서 5로 나눠 떨어지는지를 검사한다.
else에서 3씩 빼준다. 그리고 3씩 뺴준 횟수를 카운트한다.
루프가 계속 돌고 있으니 3을 뺼 때 마다 그 다음 루프에서 다시 5로 나눠떨어지는지 확인을 하게 된다.
만약 5로 나눠떨어지면 나누어 떨어지는 순간에 몫과 카운트를 더해서 출력하도록 한다.
그런데 입력받은수가 0이하가 되면 나누어 떨어지지 않는 수니까 -1을 출력하고 break
* */

public class boj2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int cnt = 0;

        while(true){
            if (num % 5 == 0){
                System.out.println(cnt + (num / 5));
                break;
            }
            else {
                num = num - 3;
                //System.out.println("num = " + num);
                cnt++;
            }
            if (num < 0){
                System.out.println("-1");
                break;
            }

        }



    }
}
