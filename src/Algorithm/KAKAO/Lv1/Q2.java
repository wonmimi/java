package Algorithm.KAKAO.Lv1;

import java.util.*;
/*
2018 kakao-blind lv1
실패율 문제
 */
public class Q2 {
    static class Solution {
//        static class Score{
//            private int stageNum;
//            private float score;
//            public Score(int num, float score){
//                this.stageNum = num;
//                this.score = score;
//            }
//        }

        public int[] solution(int N, int[] stages) {
            // 실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
            // N : 스테이지 개수
            // stages.length : 참가자 수


            int[] scoreNum = new int[N+2];
            for(int i=0; i<stages.length; i++){
                scoreNum[stages[i]]++; // 해당 번호에 ++ (인덱스 X)
            }

            int totalHuman = stages.length;

            // HashSet<Score> hashset = new HashSet();
            HashMap<Integer, Float> hashmap = new HashMap();

            int c =0;
            float score;
            for(int i=1; i<scoreNum.length-1; i++){
                // score[c] = (float)scoreNum[i]/(float)totalHuman;
                score = 0;
                if(totalHuman > 0){
                    score = (float)scoreNum[i]/(float)totalHuman;
                }
                // hashset.add(new Score(i,score));
                hashmap.put(i, score);
                totalHuman -= scoreNum[i]; // 0이 되는 경우 체크
                // c++;
            }


            // for(Score data : hashset){
            //     System.out.println(data.stageNum + " "+ data.score);
            // }

            Iterator<Integer> iterator = hashmap.keySet().iterator();
            while(iterator.hasNext()){
                int key = iterator.next();
                float scoreValue = hashmap.get(key);
                System.out.println(scoreValue);
            }


            // 내림 차순
            List<Map.Entry<Integer, Float>> entry = new LinkedList<>(hashmap.entrySet());
            Collections.sort(entry,(o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            int[] answer = new int[N];
            int count = 0;
            for(Map.Entry<Integer,Float> maps : entry){
                System.out.println(maps.getKey()+ " "+maps.getValue());
                answer[count] = maps.getKey();
                count++;
            }


            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int N = 3;
//        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
        int[] stages = new int[]{1,2,2};
        int[] answer = solution.solution(N, stages);
        for(int i : answer){
            System.out.println(i);
        }
    }
}
