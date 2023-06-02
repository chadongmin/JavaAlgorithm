package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class boj11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr = new String[str.length()];
        for (int  i = 0;i<str.length();i++){
            arr[i] = str.substring(i,str.length());
        }
        Arrays.sort(arr);

        for (var a : arr){
            System.out.println(a);
        }
    }
}
