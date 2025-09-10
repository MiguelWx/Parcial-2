package parcialclase.Model;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import parcialclase.Interface.IEncriptacion;
import parcialclase.Util.ListaEnlazada;

public class ProcesoDeEncriptacion implements IEncriptacion{

    public Deque<Frase> frases = new ArrayDeque<>();
    Deque<String> fraseSeparadas = new ArrayDeque<>();
    Deque<String> charsX = new ArrayDeque<>();
    Deque<String> valorAscii = new ArrayDeque<>();

    public ProcesoDeEncriptacion(){

    }

    public void procesarFrases() {
            Deque<String> nuevaLista = new ArrayDeque<>();
        for (Frase frase : frases) {
            String[] palabras = frase.getQ().split(" ");
            for (String palabra : palabras) {
                fraseSeparadas.add(palabra);
                for (char c : palabra.toCharArray()) {
                    charsX.add(String.valueOf(c));
                }
            }
        }

        for (String palabra : fraseSeparadas) {
                    
                    
                for (int i = 0; i < palabra.length(); i++) {
                    char ch = palabra.charAt(i);
                    int ascii = (int) ch ;
                    char nuevo = (char) ascii;
                    nuevaLista.add((int)nuevo + "");
                        
                    
                }
            }

                valorAscii = nuevaLista;

    }


public void incrementaImpar() {
    Deque<String> nuevaLista = new ArrayDeque<>();
    
    for (String palabra : fraseSeparadas) {
        int incremento = 1;  
        
        for (int i = 0; i < palabra.length(); i++) {
            char ch = palabra.charAt(i);
            int ascii = (int) ch + incremento;
            char nuevo = (char) ascii;
            nuevaLista.add((int)nuevo + "");
            
            incremento += 2;
        }
    }

    valorAscii = nuevaLista;
}


    
@Override
public boolean CifrarLetra() {
    if (valorAscii == null || valorAscii.isEmpty()) {
        return false;
    }

    ListaEnlazada lista = new ListaEnlazada();

    for (String valor : valorAscii) {
        lista.agregar(valor);
    }

    lista.intercambiarNodosAdyacentes();

    List<String> intercambiados = lista.toList();

    valorAscii.clear();
    for (String valor : intercambiados) {
        valorAscii.add(valor);
    }

    return true;
}


   @Override
    public String MostrarEncriptacion() {
        return ("Frases: "+ frases + "\n Frases separadas: " + fraseSeparadas +"\n Caracteres: " + charsX + "\n valoresAscii: " + valorAscii);
    }

   @Override
    public void DecifradoLetra() {
        ListaEnlazada lista = new ListaEnlazada();
        for (String letra : charsX) {
            lista.agregar(letra);
        }

        lista.intercambiarNodosAdyacentes();

        List<String> restaurado = lista.toList();

        String resultado = "";
        int incremento = 1;

     for (String palabra : restaurado) {    
     for (int i = 0; i < palabra.length(); i++) { 
        char c = palabra.charAt(i);            
        int asciiOriginal = (int) c - incremento;
        char original = (char) asciiOriginal;
        resultado = resultado + original;
        incremento = incremento + 2;
        }

}
    }


    @Override
public String toString() {
    String resultado = "";

    resultado += "=== Proceso de Encriptación ===\n";

    resultado += "Frases originales:\n";
    for (Frase frase : frases) {
        resultado += "- " + frase.getQ() + "\n";
    }

    resultado += "\nPalabras separadas:\n";
    for (String palabra : fraseSeparadas) {
        resultado += "- " + palabra + "\n";
    }

    resultado += "\nCaracteres actuales (charsX):\n";
    for (String c : charsX) {
        resultado += c + " ";
    }

    return resultado.trim();
}

}