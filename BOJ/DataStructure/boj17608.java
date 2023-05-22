/*아이디어 :
* 오른쪽 기준에서 보기 떄문에 무조건 제일 오른쪽에 있는 건물은
* 다 보이게 된다. 보이는 건물의 총 개수를 세려면
* 제일 오른쪽의 건물 높이보다 큰 건물의 개수를 세어야 한다.
* */

package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class boj17608 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        int tc = Integer.parseInt(br.readLine());
        int[] stack = new int[tc];
        for(int i = 0;i<tc;i++){
            stack[i] = Integer.parseInt(br.readLine());
        }
        int std = stack[tc-1];
        for(int i = stack.length-2;i>=0;i--){
            if (std < stack[i]){
                std = stack[i]; //기준값을 업데이트 해주지 않으면 중복값이 발생할 수 있다.
                cnt++;
            }
        }



        System.out.println(cnt+1);

    }
}
