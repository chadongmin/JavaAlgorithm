package BOJ.DataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;


public class boj1406_second {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        LinkedList<String> ll = new LinkedList<>();



        String str = br.readLine();

        //linked list에 입력받은 각 원소들을 입력
        for(int i = 0; i<str.length();i++){
            ll.add(str.substring(i,i+1));
        }
        ListIterator<String >iter = ll.listIterator(); // 커서 역할을 하는 Iterator
        while(iter.hasNext()){
            iter.next();
        }

        int tc = Integer.parseInt(br.readLine());
        for(int  i = 0 ;i<tc;i++){
            String input = br.readLine();
            char command  = input.charAt(0);

            switch (command){
                case 'L':
                    if(iter.hasPrevious()){
                        iter.previous();
                    }
                    break;
                case 'D':
                    if (iter.hasNext()){
                        iter.next();
                    }
                    break;
                case 'B':
                    if (iter.hasPrevious()){
                        //ll.remove(iter.previousIndex());
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    String x = input.substring(2);
                    //System.out.println("x = " + x);
                    iter.add(x);
                    break;
                default:
                    break;
            }


        }

        for(var l : ll){
            bw.write(l);
        }

        bw.flush();
        bw.close();



    }
}
