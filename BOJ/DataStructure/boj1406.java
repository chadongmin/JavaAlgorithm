package BOJ.DataStructure;

import java.io.*;
import java.util.LinkedList;


public class boj1406{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String c= "cursur";

        LinkedList<String> ll = new LinkedList<>();


        String str = br.readLine();

        //linked list에 입력받은 각 원소들을 입력
        for(int i = 0; i<str.length();i++){
            ll.add(str.substring(i,i+1));
        }
        ll.add(c);

        int tc = Integer.parseInt(br.readLine());
        for(int  i = 0 ;i<tc;i++){
            String input = br.readLine();
            //입력받은 문자가 P로 시작할때의 로직
            if (input.startsWith("P ")){
                String x =input.substring(2);
                ll.add(ll.indexOf(c),x);

            }
            //그 외 L, D, B 가 입력으로 들어왔을 때의 로직
            else {

                switch (input) {
                    case "L":
                        if (!(ll.indexOf(c)==0)){
                            String tmp = ll.get(ll.indexOf(c)-1);
                            ll.remove(ll.get(ll.indexOf(c)-1));
                            ll.add(ll.indexOf(c)+1,tmp);
                            tmp = null;
                        }
                        else break;
                        break;
                    case "D":
                        if (!(ll.indexOf(c) == ll.size()-1)){

                            String tmp = ll.get(ll.indexOf(c)+1);
                            ll.remove(ll.get(ll.indexOf(c)+1));
                            ll.add(ll.indexOf(c), tmp);
                        }
                        else break;
                        break;
                    case "B":
                        if (!(ll.indexOf(c)==0)){
                            //String tmp = ll.get(ll.indexOf(c));
                            ll.remove(ll.get(ll.indexOf(c)-1));
                        }
                        else break;
                        break;
                }

            }

        }
        ll.remove(c);
        for(var l : ll){
            bw.write(l);
        }

        bw.flush();
        bw.close();



    }
}
