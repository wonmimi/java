package DataStructure.LinkedList;
/*
    데이터 공간 - 노드
 */
public class Node<T> {
    T data;
    Node<T> next = null; // 포인터

    public Node(T data) {
        this.data = data;
    }
}
