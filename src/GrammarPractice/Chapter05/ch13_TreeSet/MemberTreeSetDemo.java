package GrammarPractice.Chapter05.ch13_TreeSet;

public class MemberTreeSetDemo {
    public static void main(String[] args) {

//        TreeSet<String> set = new TreeSet<>();
//        set.add("김남준");
//        set.add("박지민");
//        set.add("민윤기");
//
//        System.out.println(set); // 오름차순 정렬

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member1 = new Member(1001,"Jung");
        Member member2 = new Member(1003,"Park");
        Member member3 = new Member(1002,"Kim");

        memberTreeSet.addMember(member1);
        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);

//        Member member4 = new Member(1003,"Han");
//        Member member5 = new Member(1004,"Jung");
//        memberTreeSet.addMember(member4);
//        memberTreeSet.addMember(member5);


        memberTreeSet.showAllMember();

    }
}
