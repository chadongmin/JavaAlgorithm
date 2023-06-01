package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/*
* 아이디어  :
* 플래그를 활용해서 < >로 둘러쌓여 있는 태그는 그냥 출력하고
* 단어는 스택에 넣고 뺀 뒤 뒤집어서 출력한다.
*
* 스트링빌더 안에 pop한 원소들을 넣을 때는 while문을 사용해서 스택이 빌 떄 까지 넣어야한다.
*
* */
public class boj17413 {
    public static void main(String[] args) throws IOException {

        Stack<Character> st = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = false;

        String str = br.readLine();
        for(int i = 0 ;i<str.length();i++) {

            if (str.charAt(i) == '<'){
                flag = true;
                while(!st.empty()){
                    sb.append(st.pop());
                }
            } else if (str.charAt(i) == '>') {
                flag = false;
                sb.append(str.charAt(i));
                continue;
            }
            if (flag){
                sb.append(str.charAt(i));
            } else if (!flag) {
                if (str.charAt(i) == ' '){
                    while(!st.empty()){
                        sb.append(st.pop());
                    }
                    sb.append(' ');
                    continue;
                }
                st.push(str.charAt(i));
            }
            if (i == str.length()-1){
                if (!st.empty()){
                    while(!st.empty()){
                        sb.append(st.pop());
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
