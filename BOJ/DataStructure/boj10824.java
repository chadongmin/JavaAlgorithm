package BOJ.DataStructure;

import java.util.Scanner;

public class boj10824 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        Long num1 = Long.parseLong(arr[0] + arr[1]);
        Long num2 = Long.parseLong(arr[2] + arr[3]);

        System.out.println(num1+num2);


    }

}
