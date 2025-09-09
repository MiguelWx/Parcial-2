package parcialclase.Model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import parcialclase.Interface.IEncriptacion;
import parcialclase.Model.Node;

class ProcesoDeEncriptacion implements IEncriptacion{

    Deque<Frase> frases = new ArrayDeque<>();
    Deque<String> fraseSeparadas = new ArrayDeque<>();
    List<String> charsX = new LinkedList<>();

    private char ch;
    private int ascii;
    private int sumaImpar = 1;
    private String valoresChars;

    public ProcesoDeEncriptacion(){

    }

    
    for(String palabra : frases){
        String[] palabras = palabra.split(" ");

        fraseSeparadas.add(palabra);
        for(String charss : charsX){
            String[] charx = palabra.split(" ");

            charsX.add(charss);

        }
    }

    for(Node T : charsX ){
        ascii = (int)T + sumaImpar;
        valoresChars += "";
        sumaImpar += 2;
    }

    

 @Override
 public boolean CifrarLetra(List<String> chars){
    //Incremento impar,invertir nodos,
    boolean palabra=false;
    Node puntero= (Node) chars;
    Node q=null;
    while(puntero!=null && !palabra){
        if(puntero.getData()== chars){
        palabra=true;
            q=puntero;
            puntero.setNext(q.getNext());
            chars.setNext(puntero);
        } else {
            puntero=puntero.getNext();
        }
    }
    return palabra;
}



 @Override
 public void DecifradoLetra(List<String> chars) {
    // Revertir Rotacion,Restar los numeros impares y unir palabras
  }



 @Override
 public void MostrarEncriptacion() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'MostrarEncriptacion'");
 }

}