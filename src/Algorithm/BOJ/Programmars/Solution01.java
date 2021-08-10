package Algorithm.BOJ.Programmars;
import java.util.*;

class Solution01{
    Map<Integer, Integer> map = new HashMap<>();

    public int[] solution(int[] answers) {

        int[][] supoArr = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        map.put(1,0);
        map.put(2,0);
        map.put(3,0);

        for( int i=0; i< supoArr.length; i++){
            int index = 0;
            for(int x =0; x<answers.length; x++){
                index = (x==0) ? 0 : (x%supoArr[i].length);

                int value;
                int key;
                // 채점
                if(answers[x] == supoArr[i][index]){
                    key = (i + 1);
                    value = map.get(key)+1;
                    map.put(key,value);

                }

                // 다 틀렸을 경우 map 은 null
                // if(map.containsKey(key)){
                //     value = map.get(key)+1;
                //     map.put(key,value);
                // }else {
                //     map.put(key,1);
                // }

            }
        }


        List<Integer> valueList = new ArrayList<>(map.values());
        int max = Collections.max(valueList); // 최대 점수
//        int max = Math.max(valueList.get(0), Math.max(valueList.get(1), valueList.get(2))); // Math.max 도 가능

        List<Integer> returnList = new ArrayList<>();
        for(int k : map.keySet()){
            if(max == map.get(k)){
                returnList.add(k); // 리턴 List
            }
        }


        // List -> Array
        int[] result = new int[returnList.size()];
        for(int r=0; r<result.length; r++){
            result[r] = returnList.get(r);
        }


        return result;
    }
}