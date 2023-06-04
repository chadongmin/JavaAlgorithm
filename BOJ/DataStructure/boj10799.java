package BOJ.DataStructure;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class boj10799 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> st = new Stack<>();
        int sum = 0;

        String str = br.readLine();

        for(int i = 0;i < str.length();i++){
            if (str.charAt(i) == '('){
                st.push(1);
            } else if (str.charAt(i) == ')') {
                st.pop();
                if (str.charAt(i-1) == '('){
                    sum += st.size();
                }
                else sum++;
            }
        }
        System.out.println(sum);
    }


}

