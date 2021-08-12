package GrammarPractice.Chapter05.ch14_HashMap;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
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
//        return super.hashCode();
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        //        return super.equals(obj);
        if(obj instanceof Member){
            Member member = (Member) obj;
            return member.getMemberId() == this.memberId;
        }
        return false;
    }
}