package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class boj10828 {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //int tc = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            String input = br.readLine();

            if (input.startsWith("push ")) {
                int num = Integer.parseInt(input.substring(5));
                st.push(num);
            } else {
                switch (input) {
                    case "pop":
                        if (st.isEmpty())
                            System.out.println("-1");
                        else {
                            System.out.println(st.peek());
                            st.pop();
                        }
                        break;

                    case "size":
                        System.out.println(st.size());
                        break;

                    case "empty":
                        if (st.isEmpty())
                            System.out.println("1");
                        else
                            System.out.println("0");
                        break;

                    case "top":
                        if (st.isEmpty())
                            System.out.println("-1");
                        else
                            System.out.println(st.peek());
                        break;
                }
            }
        }
    }
}
