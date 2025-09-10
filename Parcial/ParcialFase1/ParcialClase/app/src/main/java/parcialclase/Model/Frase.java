package parcialclase.Model;

import java.util.LinkedList;
import java.util.Queue;

public class Frase {

    private String q;
    //private Queue<ListaEnlazada> palabrasEncriptadas = new LinkedList<>();


    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    @Override
    public String toString() {
        return "Frase: " + q ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Frase)) return false;
        Frase f = (Frase) o;
        return this.q.equals(f.q);
    }
}
