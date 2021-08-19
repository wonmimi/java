package Algorithm.BOJ.CategoryPractice;

import java.util.Scanner;

public class Greedy01_char {

    public static void main(String[] args) {
//        int ch = '0';
//        int ch1 = '1';
//        System.out.println(ch);
//        System.out.println(ch1);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // 스페이스바 기준
        int result = str.charAt(0) - '0';// 아스키코드 활용

        for(int i=1; i<str.length(); i++){ // 1 ~
            int num = str.charAt(i) - '0';
            if(result >1 && num > 1){
                result *= num;
            } else {
                result += num;
            }
        }

        System.out.println(result);
    }
}
