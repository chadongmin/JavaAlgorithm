package SWExpert;
import java.nio.Buffer;
import java.util.*;

public class sw2072 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] arr = new int[10];
        int sum = 0;


        for(int i = 0; i < testcase ; i++ ){
            for(int j = 0 ; j < 10 ; j++){
                arr[j] = sc.nextInt();
                if(arr[j] % 2 != 0) sum+=arr[j];
            }
            System.out.println("#"+(i+1)+" "+ sum);
            sum = 0;
        }
    }
}
