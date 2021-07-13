package EffectiveJava.item13;

public class HashTable implements Cloneable{

    private Entry[] buckets = new Entry[100];
    private int size = 0;

    private static class Entry {
        final Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        // 엔트리가 가르키는 연결리스트를 재귀적으로 복사
        private Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }

        // 리스트가 길 경우 스택 오버플로우 위험이있어서 반복문으로도 순회 가능
        /*
        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next)
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            return result;
        }
         */

    }

    @Override
    protected HashTable clone() {
        try {
            HashTable result = (HashTable) super.clone();
//            result.buckets = result.buckets.clone(); // 재귀호출된 clone

            result.buckets = new Entry[buckets.length];
            for (int i = 0; i < buckets.length; i++) {
                if (buckets[i] != null)
                    result.buckets[i] = buckets[i].deepCopy();
//                    result.buckets[i] = new Entry(buckets[i].key,buckets[i].value,buckets[i].next);
            }

            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void printAll(){
        for (int i=0;i<size;i++){
            System.out.println(buckets[i].toString());
        }
    }

    public void put(Entry entry){
        buckets[size++] = entry;
    }

    public static void main(String[] args) {
        HashTable hashTable1 = new HashTable();

        HashTable.Entry entry0 = new HashTable.Entry("hash0", 0, null);
        hashTable1.put(entry0);

        HashTable.Entry entry1 = new HashTable.Entry("hash1", 1, null);
        HashTable.Entry entry2 = new HashTable.Entry("hash2", 2, entry1);

        hashTable1.put(entry2);
        HashTable hashTable2 = hashTable1.clone();

        System.out.println(entry0+"     <= entry0 ");
        System.out.println(entry2+"     <= entry2 ");

        System.out.println("\n============ hashTable1 ===============");
        hashTable1.printAll();

        System.out.println("\n============ hashTable2 ===============");
        hashTable2.printAll();


//        System.out.println(entry1+"     <= entry1 "); //  = entry2.next
//        System.out.println(entry2.next);

    }


}

