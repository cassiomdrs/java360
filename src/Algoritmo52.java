import java.io.File; // Arquibo
import java.io.IOException; // Erro
import java.time.LocalDateTime; // Data e Hora
import java.time.format.DateTimeFormatter; // Formatação

public class Algoritmo52 {
    public void main (){
        int r = 0;
        do {
            IO.println("Deseja adicionar uma mensagem?");
            IO.println("Digite 1 [Sim] ou 2 [Não]");
            r = Integer.parseInt(IO.readln());
        }
        while (r==1);
    }
}
