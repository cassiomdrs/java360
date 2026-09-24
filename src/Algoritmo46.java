import java.util.ArrayList;
import java.util.List;

public class Algoritmo46 {
    public void main (){

        // List (Lista) - 100, 40, 50, 56
        // Dictionary (Dicionário) - 100: Maria, 40: JP, 50: Daniel, 56: Cassio

        // ArrayList implementa List (Lista)
        // HashMap implementa Map (chava -> valor)
        // HashSet implementa Set (conjunto)
        // LinkedList implementa Queue (fila)

        List <String> frutas = new ArrayList<>();

        frutas.add("Goiaba"); // Adiciona a fruta
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");

        IO.println("Primeira fruta: " + frutas.get(0));
        IO.println("Segunda fruta: " + frutas.get(1));
        IO.println("Terceira fruta: " + frutas.get(2));
        IO.println("Quarta fruta: " + frutas.get(3));

        IO.print("\nFruta " + frutas.get(1) + " alterada para ");
        frutas.set(1,"Uva"); // Altera a fruta
        IO.print(frutas.get(1) + "\n\n");

        for(String fruta:frutas){
            IO.println(fruta);
        }

        IO.println("\nTemos um total de " + frutas.size() + " frutas cadastradas no momento.");

        frutas.remove("Goiaba"); // Remove a fruta

        IO.println("\nHouve uma remoção de uma fruta e agora temos um total de " + frutas.size() + " frutas cadastradas.\n");

        for(String fruta:frutas){
            IO.println(fruta);
        }

    }
}
