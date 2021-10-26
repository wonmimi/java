package DataStructure;

public class MyHashChaining {
    /*
      Chaining 기법:  해쉬 테이블 저장공간 외의 공간을 활용하는 기법
    - 링크드 리스트로 데이터를 추가로 뒤에 연결시켜서 저장하는 기법
     */
    public Slot[] HashTable;

    public MyHashChaining(Integer size){
        this.HashTable = new Slot[size];
    }

    public class Slot{
        String value;
        String key;
        Slot next; // 링크드리스트

        Slot(String key, String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }


    public int hashFunc(String key){
        // Division 기법: 가장 간단한 해쉬 함수 중 하나. 나누기를 통해 나머지 값을 사용
        return ( (int)(key.charAt(0)) ) % this.HashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){ // 충돌
            Slot findSlot = this.HashTable[address]; // header 설정
            Slot prevSlot = this.HashTable[address]; // temp
            while (findSlot != null){
                if(findSlot.key == key){
                    findSlot.value = value;
                    return true;
                } else{
                    prevSlot = findSlot;
                    findSlot = findSlot.next;
                }
            }
            prevSlot.next = new Slot(key, value);
        }else{
            this.HashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){ // 키 값을 통해 바로 검색
            Slot findSlot = this.HashTable[address];
            while (findSlot != null){
                if(findSlot.key == key){
                    return findSlot.value;
                } else{
                    findSlot = findSlot.next;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashChaining hash = new MyHashChaining(20);
        hash.saveData("jung","1234567");
        hash.saveData("park","7654321");
        hash.saveData("jung","111211"); // 값 변경
        hash.saveData("jungwonmi","111111"); // 충돌 j=> chaining
        System.out.println(hash.getData("jung"));
        System.out.println(hash.getData("jungwonmi"));

        hash.saveData("DaveLee", "01022223333");
        hash.saveData("fun-coding", "01033334444");
        hash.saveData("David", "01044445555"); // 충돌 D
        hash.saveData("Dave", "01055556666"); // 충돌 D
        System.out.println(hash.getData("DaveLee"));
        System.out.println(hash.getData("David"));
    }


}
