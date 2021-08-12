package GrammarPractice.Chapter05.ch14_HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap(){
        hashMap = new HashMap<>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberId(),member);
    }

    public boolean removeMember(int memberId){ // int <=> Integer 자동 변환
        if(hashMap.containsKey(memberId)){
            hashMap.remove(memberId);
        }
        System.out.println("no element");
        return false;
    }

    public void showAllMember(){

        // 3가지
//        1)
        Iterator<Integer> iterator = hashMap.keySet().iterator();
//        2)
//        Iterator<Member> iterator = hashMap.values().iterator();
//        3)
//        Iterator<Map.Entry<Integer,Member>> iterator = hashMap.entrySet().iterator();

        while(iterator.hasNext()){
//            1)
            int key = iterator.next();
            Member member = hashMap.get(key);

//            2)
//            Member member = iterator.next();

//            3)
//            Map.Entry<Integer,Member> entry = iterator.next();
//            Member member = entry.getValue();


            System.out.println(member); // 값 출력


        }

    }
}
