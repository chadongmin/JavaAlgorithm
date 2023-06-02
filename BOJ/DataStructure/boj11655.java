package BOJ.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj11655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for (int i = 0;i<str.length();i++){
            char res = str.charAt(i);
            if ((res >= 65 && res <= 90) || (res >= 97 && res<= 122 )) {
                while (cnt < 13) {
                    if (res == 'z') {
                        res = 'a';
                        cnt++;
                        continue;
                    }
                    else if (res == 'Z') {
                        res = 'A';
                        cnt++;
                        continue;
                    }
                    ++res;
                    cnt++;
                }
            }
            System.out.print(res);
            cnt = 0;
        }
    }
}

