import java.util.ArrayList;
import java.util.List;

public class Algoritmo49 {

    public void main() {
        List<String> laboratorios = new ArrayList<>();
        int opcao = 0;

        do {
            String continuar;
            IO.println("\n<<< LABORATÓRIOS >>>");
            IO.println("1 - Adicionar");
            IO.println("2 - Alterar");
            IO.println("3 - Remover");
            IO.println("4 - Visualizar");
            IO.println("5 - Sair\n");
            opcao = Integer.parseInt(IO.readln("Digite o número da opção desejada: "));

            switch (opcao) {
                case 1:
                    laboratorios.add(IO.readln("Digite o endereço do laboratório que deseja ADICIONAR: "));
                    break;
                case 2:
                    if (laboratorios.size() != 0) {
                        for (String laboratorio : laboratorios) {
                            IO.println("Temos os seguintes laboratórios cadastrados:");
                            IO.println("Sala: " + laboratorio);
                        }
                        
                        String labRemover = IO.readln("Qual o endereço do laboratório que deseja ALTERAR? ");
                        int indice = laboratorios.indexOf(labRemover);
                        String labNovo = IO.readln("Digite o novo endereço do laboratório: ");
                        laboratorios.set(indice, labNovo);
                    } else {
                        IO.println("\nInfelizmente não temos nenhum laboratório cadastrado no momento!");
                    }
                    continuar = IO.readln("\nDigite qualquer número para continuar... ");

                    break;
                case 3:
                    if (laboratorios.size() != 0) {
                        for (String laboratorio : laboratorios) {
                            IO.println("Temos os seguintes laboratórios cadastrados:");
                            IO.println("Sala: " + laboratorio);
                        }
                        String labRemover = IO.readln("Qual o sala de laboratório que deseja REMOVER? ");
                        laboratorios.remove(labRemover);
                        IO.println("Laboratório " + labRemover + " removido com sucesso!");
                    } else {
                        IO.println("\nInfelizmente não temos nenhum laboratório cadastrado no momento!");
                    }
                    continuar = IO.readln("\nDigite qualquer número para continuar... ");

                    break;
                case 4:
                    if (laboratorios.size() != 0) {
                        for (String laboratorio : laboratorios) {
                            IO.println("Sala: " + laboratorio);
                        }
                    } else {
                        IO.println("\nInfelizmente não temos nenhum laboratório cadastrado no momento!");
                    }
                    continuar = IO.readln("\nDigite qualquer número para continuar... ");

                    break;
                case 5:
                    IO.println("Sistema encerrado!");
                    break;

                default:
                    break;
            }
        } while (opcao != 5);

    }
}