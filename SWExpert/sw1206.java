package SWExpert;
import java.util.*;
import java.lang.*;

public class sw1206 {
    /* 건물 조망권 확보 문제
    testcase는 10개로 고정, b_count 건물의 개수 변를을 선언
    b_count 크기의 배열 b_height를 선언하여 건물의 높이를 입력받는다.
    b-height기준으로 왼쪽 두칸, 오른쪽 두칸의 크기를 다 비교하여 그 중
    가장 큰 값을 max로 한다
    b_height와 max값의 크기를 비교하여 조망권 확보가 되었는지를 체크한다.
    */
    static int b_count;
    static int[] b_height ;
    static int max;

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int T;
        T=10;
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {
            b_count = sc.nextInt();
            b_height = new int[b_count];
            for(int i = 0;i<b_count;i++){
                b_height[i] = sc.nextInt();
            }
            for(int j = 2;j<b_count-2;j++){
                max = Math.max(b_height[j-2],Math.max(b_height[j-1], Math.max(b_height[j+1],b_height[j+2])));
                if((b_height[j]>max)) sum+=(b_height[j] - max);
            }
            System.out.println("#"+test_case+" "+sum);
            sum = 0;

            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            ////////////        /////////////////////////////////////////////////////////////////////////////////

        }
    }
}
