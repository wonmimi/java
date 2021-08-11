package GrammarPractice.Chapter05.ch10_List;

public class MemberArrayListDemo {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member member1 = new Member(1001,"Jung");
        Member member2 = new Member(1002,"Park");
        Member member3 = new Member(1003,"Kim");

        memberArrayList.addMember(member1);
        memberArrayList.addMember(member2);
        memberArrayList.addMember(member3);
        memberArrayList.showAllMember();
        System.out.println();
        memberArrayList.removeMember(member3.getMemberId());

        memberArrayList.showAllMember();

    }
}
