package BOJ.DataStructure;

import java.util.ArrayList;

public class arrayListTest {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(0, 4);
        arr.add(0,5);
        arr.add(2, 3);

        for(var a : arr){
            System.out.println(a);
        }
    }
}
