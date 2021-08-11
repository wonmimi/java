package GrammarPractice.Chapter05.ch12_Set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;


    public MemberHashSet(){
        hashSet = new HashSet<>();
    }

    public void addMember(Member member){
        hashSet.add(member);
    }

    public boolean removeMember(int memberId){

        // 2) iterator
        Iterator<Member> ir = hashSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if(memberId == member.getMemberId()){
                hashSet.remove(member); // element
                return  true;
            }
        }


        System.out.println(memberId+ " 가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : hashSet){
            System.out.println(member.toString());
        }
    }

}
