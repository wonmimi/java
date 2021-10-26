package DataStructure;

import java.util.HashMap;
import java.util.HashSet;

public class MyHash {
    public Slot[] HashTable;

    public MyHash(Integer size){
        this.HashTable = new Slot[size];
    }

    public class Slot{
        String value;

        Slot(String value){
            this.value = value;
        }
    }


    public int hashFunc(String key){
        // Division 기법: 가장 간단한 해쉬 함수 중 하나. 나누기를 통해 나머지 값을 사용
        return ( (int)(key.charAt(0)) ) % this.HashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){
            this.HashTable[address].value = value; // 충돌 ( 값 변경 처리 )
        }else{
            this.HashTable[address] = new Slot(value);
        }
        return true;
    }

    public String getData(String key){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){ // 키 값을 통해 바로 검색
            return HashTable[address].value;
        } else {
            return  null;
        }
    }

    public static void main(String[] args) {
        MyHash hash = new MyHash(20);
        hash.saveData("jung","1234567");
        hash.saveData("park","7654321");
        hash.saveData("jung","111211");
        hash.saveData("jungWonmi","111111"); //충돌 (j)
        System.out.println(hash.getData("jung"));
        System.out.println(hash.getData("jungWonmi"));

        hash.saveData("DaveLee", "01022223333");
        hash.saveData("fun-coding", "01033334444");
        hash.saveData("David", "01044445555"); // 충돌 D
        hash.saveData("Dave", "01055556666"); // 충돌 D
        System.out.println(hash.getData("DaveLee"));
        System.out.println(hash.getData("David"));
    }


}
