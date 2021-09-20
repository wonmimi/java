package DataStructure.LinkedList;

public class DoubleLinkedList<T>{
    public Node<T> head = null;
    public Node<T> tail = null;

    // Node 객체 정의
    public class Node<T>{
        T data;
        Node<T> prev = null; // 추가
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if(this.head == null){
            this.head = new Node<>(data);
            this.tail = this.head;
        } else {
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next; // 멘 마지막 까지 이동
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }


    //  임의 노드 앞에 노드를 추가
    public void addNodeToFront(T isData, T data){
        if(this.head == null){
            addNode(data);
        } else {
            Node<T> searchNode = searchNode(isData);
            if (searchNode ==  null){
                addNode(data); // 맨뒤에 넣기
            } else{
                if(searchNode == this.head){
                    Node<T> prevNode = searchNode;
                    this.head = new Node<>(data);

                    this.head.next = prevNode;
                    prevNode.prev = this.head;
                } else {
                    // 앞에 추가
                    Node<T> prevNode = searchNode.prev;
                    searchNode.prev = new Node<>(data);
                    searchNode.prev.prev = prevNode;

                    prevNode.next = searchNode.prev;
                    prevNode.next.next = searchNode;  // =  searchNode.prev.next = searchNode;

                }

            }
        }
    }

    public void addNodeToAfter(T isData, T data){
        if(this.head == null){
            addNode(data);
        } else {
            Node<T> searchNode = searchNode(isData);
            if (searchNode ==  null){
                addNode(data); // 맨뒤에 넣기
            } else{
                if(searchNode == this.tail){
                    Node<T> node = new Node<>(data);
                    searchNode.next = node;
                    searchNode.next.prev = searchNode;
                    this.tail = node;
//                    addNode(data);
                } else {

                    // 뒤에 추가
                    Node<T> nextNode = searchNode.next;

                    searchNode.next = new Node<>(data);
                    searchNode.next.prev = searchNode;
                    searchNode.next.next = nextNode;
                    nextNode.prev = searchNode.next;
                }

            }
        }
    }


    public Node<T> searchNode(T isData){
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data.equals(isData)) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }


    public T searchFromHead(T isData){
        if (this.head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data.equals(isData)) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public T searchFromTail(T isData){
        if (this.head != null) {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data.equals(isData)) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
        }
        return null;
    }


    public void printAll(){
        if(this.head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
    

    public static void main(String[] args) {
        DoubleLinkedList<Integer> linkedList = new DoubleLinkedList<>();

        linkedList.addNode(0);
        linkedList.addNode(6);
        linkedList.addNode(1);
        linkedList.addNode(3);

        linkedList.printAll();

        System.out.println("===== search ====");
        System.out.println(linkedList.searchFromHead(6));
        System.out.println(linkedList.searchFromHead(2));
        System.out.println(linkedList.searchFromTail(1));
        System.out.println(linkedList.searchFromTail(2));

        System.out.println("==== insert ====");
        linkedList.addNodeToFront(1,2);
        linkedList.addNodeToFront(9,10);
        linkedList.addNodeToFront(0,77);
        linkedList.addNodeToFront(3,101);
        linkedList.printAll();

        System.out.println("=== insert mix====");
        linkedList.addNodeToAfter(77,1000);
        linkedList.addNodeToAfter(0,10);
        linkedList.addNodeToAfter(999,111);
        linkedList.addNodeToAfter(111,200);
        linkedList.addNodeToFront(200,199);
        linkedList.printAll();

    }
}
