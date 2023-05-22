
package BOJ.DataStructure;
import java.util.*;


public class boj2605 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        //int [] result = new int[tc];
        arr.add(0);

        for(int i = 1;i <= tc;i++){
            int num = sc.nextInt();
            arr.add(i-num,i);
        }
        for(int i = 1;i<=tc;i++){
            System.out.print(arr.get(i)+ " ");
        }
    }
}
