package parcialclase.Model;

import parcialclase.Interface.IEncriptacion;
import java.util.*;

public class Node<T>{
    private T data;
    private Node<T> next;
    //private Deque List<String> chars cola = new ArrayDeque<>();

    public Node(T data){
        this.data = data;
        this.next = null;

    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }


}