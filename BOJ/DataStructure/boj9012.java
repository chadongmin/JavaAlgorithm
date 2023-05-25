package BOJ.DataStructure;

import java.util.Scanner;
import java.util.Stack;
/*
* 괄호 문제
* ( 가 들어왔을때는 stack에 push하고 )가 들어왔을때는 pop을 하는 매커니즘으로 동작해야 함.
* stack은 lifo구조로써 비어있을때는 pop을 할 수 없다. 그래서 ( 가 들어왔을때 empty면 바로 NO를 리턴해야한다.
* string의 length만큼 루프를 다 돌았다면 마지막 상태에서 empty라면 VPS라서 YES를 리턴하고 empty가 아니라면 (와 )의 개수가 다르다는 것이므로
* NO를 리턴한다.
* */

public class boj9012 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 0;i<tc;i++){
            String str = sc.next();
            System.out.println(VPS(str));
        }
    }
    public static String VPS(String str){
        Stack<String> st = new Stack<>();
        for(int j = 0;j<str.length();j++){
            if(str.charAt(j) == '('){
                st.push("(");
            }
            else if(str.charAt(j) == ')'){
                if (st.empty())  return "NO";
                else st.pop();
            }
        }
        if (st.empty()) return "YES";
        else return "NO";
    }

}
