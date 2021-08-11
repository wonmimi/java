package GrammarPractice.Chapter05.ch12_Set;

public class MemberHashSetDemo {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member1 = new Member(1001,"Jung");
        Member member2 = new Member(1002,"Park");
        Member member3 = new Member(1003,"Kim");

        memberHashSet.addMember(member1);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        Member member4 = new Member(1003,"Han");
        Member member5 = new Member(1004,"Jung");
        memberHashSet.addMember(member4);
        memberHashSet.addMember(member5);


        memberHashSet.showAllMember();

    }
}
