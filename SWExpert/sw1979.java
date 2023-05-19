package SWExpert;
import java.util.*;

public class sw1979 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int n = 0;n<testcase;n++) {


            int size = sc.nextInt();
            int num = sc.nextInt();
            int cnt = 0;
            int resultCnt = 0;

            int[][] arr = new int[size][size];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            //행 검사
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1)
                        cnt++;
                    else if (cnt >= 1 && arr[i][j] == 0) {
                        if (cnt == num) resultCnt++;
                        cnt = 0;
                    }
                }
                if (cnt == num) resultCnt++;
                cnt = 0;
            }
            //i와 j를 바꿔서 열 검사
            for (int j = 0; j < arr.length; j++) {
                for (int i = 0; i < arr[j].length; i++) {
                    if (arr[i][j] == 1)
                        cnt++;
                    else if (cnt >= 1 && arr[i][j] == 0) {
                        if (cnt == num) resultCnt++;
                        cnt = 0;
                    }
                }
                if (cnt == num) resultCnt++;
                cnt = 0;
            }
            System.out.println("#"+(n+1)+" "+resultCnt);
        }
    }
}
