package DataStructure.LinkedList;


public class SingleLinkedList<T> {
    public Node<T> head = null; // 맨 앞 요소

    public void addNode(T data){ // 맨 뒤에 추가
        if(head == null){
            head = new Node<T>(data);
        } else{
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next;// 마지막 노드가 될때 까지.
            }
            node.next = new Node<>(data);
        }
    }

    public Node<T> search(T data){
        if(this.head == null){
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null){
                if(node.data.equals(data)){
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    public void addNodeInside(T data, T isData){ // 사이에 데이터 추가
        Node<T> searchedNode = this.search(isData);

        if(searchedNode == null){
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next; // = temp
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }

    // 삭제처리하는 요소는 jvm에 의해 자동 삭제됨
    public boolean delNode(T isData){ // 특정 노드 삭제
        if(this.head == null){
            return false;
        } else {
            Node<T> node = this.head;
            if(node.data.equals(isData)){ // 맨 첫 데이터 일경우
                this.head = this.head.next;
                return true;
            }else {
                while(node.next != null){
                    if(node.next.data.equals(isData)){ // 값의 비교
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }


    public void printAll(){
        if(head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<Integer> linkedList = new SingleLinkedList<>();
        linkedList.addNode(0);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(777);

        linkedList.printAll();
        System.out.println("=======addInside========");
        linkedList.addNodeInside(613,2);
        linkedList.addNodeInside(1013,222); // 없는 데이터 => 맨뒤
        linkedList.addNodeInside(1234,222);
        linkedList.printAll();

        System.out.println("=======del==========");
        linkedList.delNode(2); // 중간
        linkedList.delNode(0); // 처음
        System.out.println(" >"+linkedList.delNode(999)); // 없는 : false
        linkedList.delNode(1234); // 마지막

        linkedList.printAll();


    }
}
