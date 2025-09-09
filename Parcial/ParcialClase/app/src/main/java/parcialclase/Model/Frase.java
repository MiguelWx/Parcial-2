package parcialclase.Model;

public class Frase{
    private String q;
    private String a;
    private String c;
    private String h;
    
    // public String getA() {
    //     return a;
    // }

    // public String getC() {
    //     return c;
    // }

    // public String getH() {
    //     return h;
    // }

    public String getQ() {
        return q;
    }
    
    // public void setA(String a) {
    //     this.a = a;
    // }

    // public void setC(String c) {
    //     this.c = c;
    // }

    // public void setH(String h) {
    //     this.h = h;
    // }

    public void setQ(String q) {
        this.q = q;
    }


    @Override
    public String toString(){
        return "Frase: "+ q + "\n Frase enredada: " + a + "\n Numero: " + c + "\n ¿?" + h;
    }

    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; 
        if (!(o instanceof Frase)) return false; 
        Frase a = (Frase) o;
        return this.q == a.q; 
    }

}