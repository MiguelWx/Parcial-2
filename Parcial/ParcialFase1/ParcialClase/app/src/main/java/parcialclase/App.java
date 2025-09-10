package parcialclase;

import parcialclase.Model.ProcesoDeEncriptacion;
import parcialclase.Model.Frase;
import parcialclase.Service.ApiService;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ApiService api = new ApiService();

        List<Frase> frases = api.getFrases();

        ProcesoDeEncriptacion proc = new ProcesoDeEncriptacion();

        Frase frase = new Frase();

        frase.setQ("HOLA MUNDO");

        proc.frases.add(frase);

       

        for (Frase f : frases) {
            proc.frases.add(f);
            
        }

        proc.procesarFrases();

       
        proc.incrementaImpar();

       
        proc.CifrarLetra();

       
        System.out.println(proc.MostrarEncriptacion());

        //proc.DecifradoLetra();

        proc.MostrarEncriptacion();

    }
}
