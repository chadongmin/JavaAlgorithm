package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0;i<arr.length;i++){
            arr[i] = 0;
        }

        for (int i = 0;i<str.length();i++){
            char alp = 97;
            while(alp <= 'z'){
                if (str.charAt(i) == alp){
                    arr[alp-97]++;
                    break;
                }else alp++;
            }
        }
        for (var a : arr){
            System.out.print(a+" ");
        }

    }
}
