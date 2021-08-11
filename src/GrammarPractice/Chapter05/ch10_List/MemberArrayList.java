package GrammarPractice.Chapter05.ch10_List;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;


    public MemberArrayList(){
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size){
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member){
        arrayList.add(member);
    }

    public boolean removeMember(int memberId){

        // 2) iterator
        Iterator<Member> ir = arrayList.iterator();
        while (ir.hasNext()){
            Member member = ir.next();
            if(memberId == member.getMemberId()){
                arrayList.remove(member); // element
                return  true;
            }
        }

        // 1) get()
//        for(int i =0; i<arrayList.size(); i++){
//            Member member = arrayList.get(i);
//            if(member.getMemberId() == memberId){
//                arrayList.remove(i);
//                return true;
//            }
//        }

        System.out.println(memberId+ " 가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member member : arrayList){
            System.out.println(member.toString());
        }
    }

}
