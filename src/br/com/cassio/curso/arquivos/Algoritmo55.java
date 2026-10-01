package br.com.cassio.curso.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Algoritmo55 {
    /*
    Considerando a lógica aristotélica, organize os programas de fluxogramas e pseudocódigo a saber:
    
    visualgo.net
    csvistool.com
    geeksforgeeks.org
    FAQ do professor nesse repositório: faq_logica.pdf

    Crie um arquivo que possa armazenar valores de um dicionário
    Map (Interface) - HashMap (Classe)

    Ambiente - Laboratório de programação JAVA
    Chave: F07
    Chave: F07 Descrição: "Laboratório de programação Java"
    Chave: B03 Descrição: "Sala de Aula Padrão"
    Chave: G09 Descrição: "Oficina de lanternagem e pintura"

    Problema:
    Criar um cadastro de um dicionário de ambientes, esse cadastro deverá armazenar em um arquivo .txt, deverá ter um loop (DO WHILE)
    com um menu de opções.

    1) Cadastrar
    2) Listar
    3) Pesquisar
    4) Excluir
    5) Alterar
    6) Sair

    Avaliação de capacidades:
    - Elaborar e explicar um (TRY, CATCH, FINALLY)
    - Uso de JOptionPane ou JFrame ou outros SWING
    - Elaborar e explicar LocalDateTime
    - Elaborar e explicar FileWriter
    - Elaborar e explicar HashMap
    - Elaborar e explicar Map
    - Elaborar e explicar a organização do código

     */

    void main (){
        
        Map<String, ChavesAmbiente> ambientes = new HashMap<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        int op = 0;

        do{

            IO.println(">>>>>>> Dicionário de Chaves <<<<<<<");
            IO.println("1) Cadastrar");
            IO.println("2) Listar");
            IO.println("3) Pesquisar");
            IO.println("4) Excluir");
            IO.println("5) Alterar");
            IO.println("6) Sair");
            op = Integer.parseInt(IO.readln("\nDigite o número da opção desejada:\n"));

            switch (op) {
                case 1:

                    String chaveDigitada = IO.readln("Digite nome da chave da sala:\n");
                    String descricaoDigitada = IO.readln("Digite a descrição:\n");
                    String dataHora = LocalDateTime.now().format(formato);

                    ChavesAmbiente novoObjeto = new ChavesAmbiente(chaveDigitada, descricaoDigitada);

                    if (ambientes.containsKey(chaveDigitada)) {
                        IO.println("\n⚠️ Opa! Essa chave já está cadastrada.\n");
                    } else {
                        try (FileWriter arquivo = new FileWriter("chaves_ambientes.txt", true)){
                            arquivo.write("[" + dataHora + "] " + chaveDigitada + " - " + descricaoDigitada + "\n");
                            IO.println("[" + dataHora + "] " + chaveDigitada + " - " + descricaoDigitada);
                            ambientes.put(chaveDigitada, novoObjeto);
                            
                            IO.println("CADASTRADO COM SUCESSO!\n");
                            }
                        catch(IOException e){
                            IO.println(" Erro ao cadastrar chave: " + e.getMessage());
                        }
                    }
                    
                    break;

                case 2:
                    
                    if (ambientes.isEmpty()) {
                        IO.println("\n📭 Nenhum ambiente cadastrado ainda.\n");
                    } else {
                        for (String chave : ambientes.keySet()) {
                            ChavesAmbiente ambiente = ambientes.get(chave);
                            IO.println("Chave: " + chave + " | Descrição: " + ambiente.getDescricao());
                        }
                    }

                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    break;

                case 5:
                    
                    break;
                
                default:
                    break;
            }

        } while (op < 6);

    }
}
