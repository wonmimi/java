package GrammarPractice.Chapter05.ch14_HashMap;


import java.util.HashMap;

public class MemberHashMapDemo {
    public static void main(String[] args) {
        MemberHashMap memberHashmap = new MemberHashMap();

        Member member1 = new Member(1001,"Jung");
        Member member2 = new Member(1002,"Park");
        Member member3 = new Member(1003,"Kim");

        memberHashmap.addMember(member1);
        memberHashmap.addMember(member2);
        memberHashmap.addMember(member3);

        Member member4 = new Member(1003,"Han");
        Member member5 = new Member(1004,"Jung");
        memberHashmap.addMember(member4);
        memberHashmap.addMember(member5);


        memberHashmap.showAllMember();

//        HashMap map = new HashMap();
//        map.put(1,'w');
//        map.put(2,'m');
//        System.out.println(map);

    }
}
