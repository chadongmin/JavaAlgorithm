package BOJ.DataStructure;

import java.io.*;
/*
*
* 문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.

* 아이디어 :
* 공백으로 입력받은 문자열을 구분해서 각각 String 타입의 배열에 담는다.
* 이 과정에서 StringTokenizer을 사용해서 분리했는데 잘 안담겨서 시간을 오래 소모함
* split함수를 써서 성공함
* 그리고 for문을 써서 역순으로 루프를 돌아서 출력
*
* 고찰 :
* 하지만 LIFO 구조를 가지고 있는 stack에 공백으로 구분한 문자열을 담았으면
* 마지막에 들어온 순서대로 출력되니까 쉽게 구현할 수 있었을텐데 하는 아쉬움이 든다.
 */

public class boj9093 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        for(int i = 0;i<tc;i++){
            String str = br.readLine();
            String[] arr = str.split(" ");

            for (var a: arr){
                for (int j = a.length()-1;j>=0;j--){
                    //System.out.print(a.charAt(j));
                    bw.write(a.charAt(j));

                }
                //System.out.print(" ");
                bw.write(" ");
            }
            bw.write("\n");

        }
        bw.flush();
        bw.close();
    }
}
