package DataStructure;

public class MyHashLinear {
    /*
        Linear Probing 기법 : 해쉬 테이블 저장공간 안에서 충돌 문제를 해결하는 기법
        - 충돌이 일어나면, 해당 hash address의 다음 address부터 맨 처음 나오는 빈공간에 저장하는 기법
     */
    public Slot[] HashTable;

    public MyHashLinear(Integer size){
        this.HashTable = new Slot[size];
    }

    public class Slot{
        String value;
        String key;

        Slot(String key, String value){
            this.key = key;
            this.value = value;
        }
    }


    public int hashFunc(String key){
        // Division 기법: 가장 간단한 해쉬 함수 중 하나. 나누기를 통해 나머지 값을 사용
        return ( (int)(key.charAt(0)) ) % this.HashTable.length;
    }

    public boolean saveData(String key, String value){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){ // 충돌
            if(HashTable[address].key == key){
                HashTable[address].value = value; // 값 업데이트
            } else {
                int currentAddress = address + 1;
                while (HashTable[currentAddress] != null){
                    if(HashTable[currentAddress].key == key){
                        HashTable[currentAddress].value = value;
                    } else {
                        currentAddress++;
                        if(currentAddress >= HashTable.length) return false;
                    }
                }
                HashTable[currentAddress] = new Slot(key, value);
                return true;
            }
        }else{
            this.HashTable[address] = new Slot(key, value);
        }
        return true;
    }

    public String getData(String key){
        int address = this.hashFunc(key);
        if(this.HashTable[address] != null){
            if(HashTable[address].key == key){
                return HashTable[address].value;
            } else {
                int currentAddress = address + 1;
                while (HashTable[currentAddress] != null){
                    if(HashTable[currentAddress].key == key){
                        return HashTable[currentAddress].value;
                    } else {
                        currentAddress++;
                        if(currentAddress >= HashTable.length) return null;
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        MyHashLinear hash = new MyHashLinear(20);
        hash.saveData("jung","1234567");
        hash.saveData("park","7654321");
        hash.saveData("jung","111211"); // 값 변경
        hash.saveData("jungwonmi","111111"); // 충돌 j=> chaining
        System.out.println(hash.getData("jung"));
        System.out.println(hash.getData("jungwonmi"));

        hash.saveData("DaveLee", "01022223333");
        hash.saveData("fun-coding", "01033334444");
        hash.saveData("David", "01044445555"); // 충돌 D
        hash.saveData("Dave", "1111111"); // 충돌 D
        System.out.println(hash.getData("DaveLee"));
        System.out.println(hash.getData("David"));
        System.out.println(hash.getData("Dave"));
    }


}
