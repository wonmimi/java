package Algorithm.KAKAO.Lv1;

public class Q1 {
    /*
    2018 kakao-blind lv1
    신규 아이디 추천
     */
     static class Solution {
        public String solution(String new_id) {
            String answer = "";

            // 소문자 치환
            new_id = new_id.toLowerCase();

            // 소문자, 숫자, - , _ , .  외  문자 제거
            new_id = new_id.replaceAll("[^a-z|0-9|\\-|_|.]","");

            // new_id = new_id.replaceAll(".{2}",".");
            // . 2번 이상 -> . 치환
            new_id = new_id.replaceAll("[.]{2,}",".");

            // . 처음이나 끝 => 제거
            new_id = new_id.replaceAll("^[.]|[.]$","");

            // 빈문자열 => a 대입
            if(new_id.isEmpty()) new_id = "a";

            // 16자 이상 => 0~14 까지  마침표 . 있으면 제거
            if(new_id.length() >= 16){
                new_id = new_id.substring(0,15);
                new_id = new_id.replaceAll("[.]$","");

            }

            // 2이하 => 길이 3일떄까지 마지막문자 이어 붙이기

            int strLength = new_id.length();
            while(strLength < 3 ){
                String lastChar = Character.toString(new_id.charAt(strLength -1));
                new_id += lastChar;
                strLength = new_id.length();
                lastChar = Character.toString(new_id.charAt(strLength -1));
            }

            answer = new_id;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "...!@BaT#*..y.abcdefghijklm";
        System.out.println(solution.solution(str));
    }
}
