package GrammarPractice.Chapter05.ch13_TreeSet;

import java.util.Comparator;

public class Member implements Comparable<Member>{ // 1)
//public class Member implements Comparator<Member> { // 2)
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public Member() {

    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString(){
        return memberName + " 님의 아이디는 "+ memberId + "입니다";
    }

    @Override
    public int hashCode() {
        return memberId;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.getMemberId() == this.memberId;
        }
        return false;
    }

    // 2) implements Comparator
//    @Override
//    public int compare(Member m1, Member m2) {
////        return (m1.getMemberId() - m2.getMemberId()); // 오름 차순
//        return (m1.getMemberId() - m2.getMemberId()) * -1; // 내림 차순
//    }


    // 1) implements Comparable
    @Override
    public int compareTo(Member member) { // callback Function

//        if(this.memberId > member.getMemberId()){
//            return 1;
//        } else if(this.memberId < member.getMemberId()){
//            return -1;
//        } else {
//            return 0;
//        }

//        return (this.memberId - member.getMemberId()); // 오름차순
        return (member.getMemberId() - this.memberId ); // 내림차순 (트리가 뒤집어짐)

    }
}