package br.com.cassio.curso.logica;
import java.util.List;

public class AlgoritmoDezenoveAl {
    public void main () {
        List<String> usuarios = List.of("Ana","Bruno","Carla","Diego");
        usuarios.forEach(nomes -> IO.println(nomes));
    }
}
