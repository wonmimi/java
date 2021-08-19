package Algorithm.BOJ.CategoryPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine(); // 엔터 기준 (줄바꿈)
        String[] strArr = inputStr.split(" ");

        int size = strArr.length;

        for(String v : strArr){
            System.out.println(v);
        }

        Arrays.sort(strArr, Collections.reverseOrder());
        for(String v : strArr){
            System.out.println(v);
        }
        System.out.println();
        System.out.println(size);



    }
}
