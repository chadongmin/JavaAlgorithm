package SWExpert;
import java.util.*;
import java.lang.*;
import java.io.*;

public class sw1859 {
    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Tc = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= Tc; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line," ");	//공백단위로 값 분리

            //arr에 입력값 담기 - 매매가
            for (int k = 0; st.hasMoreTokens(); k++) {
                arr[k] = Integer.parseInt(st.nextToken());
            }

            int len = arr.length;

            //뒤에서부터 큰값이 나오면 리셋하기.맨뒤에 값이 무조건 큰값이라고 가정하기
            long max = Long.MIN_VALUE;
            int num = 0;
            long cost = 0L;		//구매가
            long result = 0L; 	//최종
            for (int i = arr.length-1 ;  i >= 0 ; i--) {
                // 더 큰 최댓값을 찾았다면? 호다닥 사자 ! 비용계산하기 : 사야할 애들의 갯수  * 판매가  - 구매가
                if( arr[i] > max ) {
                    result += (max*num - cost);
                    max = arr[i];
                    //초기화
                    cost = 0;
                    num = 0;
                }else {	//max 보다 작으면 사자
                    cost+=arr[i];
                    num++;
                }
            }

            //마지막에 한번 더 해주기
            result += (max*num - cost);

            System.out.println("#" + tc + " " + result);
        }// Tc
    }
}
