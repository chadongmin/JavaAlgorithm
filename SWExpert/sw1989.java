package SWExpert;
import java.util.*;
import java.lang.*;


public class sw1989 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int cnt = 0;
        int testcase = sc.nextInt();

        String str;
        for(int i = 0;i<testcase;i++){
            str = sc.next();
            for(int j = 0;j<Math.floor(str.length()/2);j++) {


    //                System.out.println(str.substring(j, j + 1));
    //                System.out.println(str.substring(str.length() - (j+1), str.length()-j));
                if(str.substring(j, j + 1).equals(str.substring(str.length() - (j+1), str.length()-j))){
                    cnt++;
                }
            }

            if (cnt == Math.floor(str.length()/2)) System.out.println("#"+i+1+" "+1);
            else System.out.println("#"+i+1+" "+0);
            cnt=0;
//            System.out.println(str.substring(0,1));
//            System.out.println(str.substring(str.length()-1,str.length()));

        }
    }
}
