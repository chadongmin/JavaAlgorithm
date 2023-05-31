package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int  tc  = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<tc;i++){
            int input = Integer.parseInt(br.readLine());

            if (input != 0){
                st.push(input);
            }
            else st.pop();
        }
        int sum = 0;
        for (var s : st){
            sum+=s;
        }

        System.out.println(sum);

    }
}
