package Algorithm.BOJ.CategoryPractice;

import java.util.Scanner;

public class Greedy01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // 스페이스바 기준
        String[] strArr = str.split("");


        int result = Integer.parseInt(strArr[0]);
        for(int i=1; i<strArr.length; i++){ // 1 ~
            int num = Integer.parseInt(strArr[i]);
            if(result >1 && num > 1){
                result *= num;
            } else {
                result += num;
            }
        }

        System.out.println(result);
    }
}
