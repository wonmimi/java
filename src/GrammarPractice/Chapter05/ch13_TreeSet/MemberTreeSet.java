package GrammarPractice.Chapter05.ch13_TreeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;


    public MemberTreeSet(){
        treeSet = new TreeSet<>(); //1)

        // Comparator를 구현(compare()을 실행하는)하는 대상 생성
//        treeSet = new TreeSet<>(new Member()); //2)
    }


    public void addMember(Member member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        // 2) iterator
        Iterator<Member> ir = treeSet.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if(memberId == member.getMemberId()){
                treeSet.remove(member); // element
                return  true;
            }
        }


        System.out.println(memberId+ " 가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : treeSet){
            System.out.println(member.toString());
        }
    }

}
