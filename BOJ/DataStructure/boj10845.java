package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
* 아이디어 :
* 큐의 맨 뒤를 출력하는 메소드가 구현되어 있지 않는데, 어떻게 구현할지를 좀 더 고민했어야 했다.
* 정수형으로 타입이 고정되어 있으니까 정수형 변수를 하나 만들고 push 할 때 마다 last변수에 할당한다.
* 그러면 push할 떄 마다 last변수는 항상 변하게 되므로 큐의 맨 뒤를 출력할때는 last 변수의 값을 출력하면 된다.
*
* */
public class boj10845 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Queue<Integer> queue = new LinkedList<>();
        //Iterator iter = queue.iterator();
        int last = 0;
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0;i < tc ;i++){
            String input= br.readLine();
            String[] arr = input.split(" ");
            //System.out.println(arr[0]);

            switch (arr[0]){
                case "push":
                    queue.offer(Integer.parseInt(arr[1]));
                    last = Integer.parseInt(arr[1]);
                    break;
                case "pop":
                    if (!queue.isEmpty()) {
                        System.out.println(queue.peek());
                        queue.remove();
                    }
                    else System.out.println("-1");
                    break;
                case "front":
                    if (!queue.isEmpty())  System.out.println(queue.peek());
                    else System.out.println("-1");
                    break;
                case "back":
                    if (!queue.isEmpty()) {
                        System.out.println(last);
                    }
                    else System.out.println("-1");
                    break;
                case "empty":
                    if (queue.isEmpty()) System.out.println("1");
                    else System.out.println("0");
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;

            }
        }
//        for (var q : queue){
//            System.out.println(q);
//        }
    }
}
