package parcialclase.Interface;

import java.util.List;

public interface IEncriptacion{

    boolean CifrarLetra(List<String> chars);
    void DecifradoLetra(List<String> chars);
    void MostrarEncriptacion();
}