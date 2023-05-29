package BOJ.DataStructure;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class boj1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        ArrayList<String> result = new ArrayList<>();
        int arrlen = sc.nextInt();
        int[] arr = new int[arrlen];
        //int[] poparr = new int[arrlen];
        int seq = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i <= arrlen; i++) {
            //1부터 오름차순으로 스택에 값 넣기
            st.push(i);
            result.add("+");
            // 오름차순으로 값을 한번 넣을 떄 마다 수열의 첫번째 값과 같은지 비교
            while (!st.empty() && st.peek() == arr[seq]) {
                st.pop();
                result.add("-");
                seq++;
            }
        }
        if (st.empty()) {
            for (var a : result){
                System.out.println(a);
            }
        }
        else System.out.println("NO");
    }
}
