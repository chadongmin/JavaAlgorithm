package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj10820 {
    public static void main(String[] args)throws IOException {

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        String str = "";

        while((str = br.readLine()) != null){
            int upper = 0;
            int lower = 0;
            int num = 0;
            int space = 0;

            for (int i = 0; i<str.length();i++){
                if (str.charAt(i)>=65 && str.charAt(i)<=90){
                    upper++;
                } else if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    lower++;
                } else if (str.charAt(i) == 32) {
                    space++;
                }
                else num++;
            }
            System.out.print(lower+" "+upper+" "+num+" "+space);
            System.out.println();
        }


    }
}
