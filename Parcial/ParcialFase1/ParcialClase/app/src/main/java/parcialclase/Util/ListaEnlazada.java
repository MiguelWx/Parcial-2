package parcialclase.Util;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ListaEnlazada {
    private Node cabeza;

    public void agregar(String data) {
        Node nuevo = new Node(data);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Node actual = cabeza;
            while (actual.getNext() != null) {
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
    }

    public void intercambiarNodosAdyacentes() {
        if (cabeza == null || cabeza.getNext() == null) return;

        Node nodo = new Node(""); 
        nodo.setNext(cabeza);
        Node anterior = nodo;

        while (anterior.getNext() != null && anterior.getNext().getNext() != null) {
            Node primero = anterior.getNext();
            Node segundo = primero.getNext();

            primero.setNext(segundo.getNext());
            segundo.setNext(primero);
            anterior.setNext(segundo);

            anterior = primero;
        }

        cabeza = nodo.getNext();
    }

    public List<String> toList() {
        List<String> lista = new LinkedList<>();
        Node actual = cabeza;
        while (actual != null) {
            lista.add((String) actual.getData());
            actual = actual.getNext();
        }
        return lista;
    }

   


}

