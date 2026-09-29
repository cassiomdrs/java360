import java.io.FileWriter; // Arquibo
import java.io.IOException; // Erro
import java.time.LocalDateTime; // Data e Hora
import java.time.format.DateTimeFormatter; // Formatação

public class Algoritmo52 {
    public void main (){
        int r = 0;
        do {

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            IO.println("Digite sua dúvida:");
            String duvida = IO.readln();

            // Carimbo capturado no momento do registro
            String carimbo = LocalDateTime.now().format(formato);

            try (FileWriter arquivo = new FileWriter("registro.txt", true)){
                arquivo.write("[" + carimbo + "] " + duvida + "\n");
                IO.println("Registrado: [" + carimbo + "] " + duvida);
                
                IO.println("Deseja registrar nova dúvida?");
                IO.println("Digite 1 [Sim] ou 2 [Não]");
                r = Integer.parseInt(IO.readln());

            }
            catch(IOException e){
                IO.println(" Erro ao salvar a sua dúvida: " + e.getMessage());
            }
            
        }
        while (r==1);
    }
}
