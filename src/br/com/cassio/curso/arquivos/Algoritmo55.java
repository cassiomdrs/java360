package br.com.cassio.curso.arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Algoritmo55 {
    /*
     * Considerando a lógica aristotélica, organize os programas de fluxogramas e
     * pseudocódigo a saber:
     * 
     * visualgo.net
     * csvistool.com
     * geeksforgeeks.org
     * FAQ do professor nesse repositório: faq_logica.pdf
     * 
     * Crie um arquivo que possa armazenar valores de um dicionário
     * Map (Interface) - HashMap (Classe)
     * 
     * Ambiente - Laboratório de programação JAVA
     * Chave: F07
     * Chave: F07 Descrição: "Laboratório de programação Java"
     * Chave: B03 Descrição: "Sala de Aula Padrão"
     * Chave: G09 Descrição: "Oficina de lanternagem e pintura"
     * 
     * Problema:
     * Criar um cadastro de um dicionário de ambientes, esse cadastro deverá
     * armazenar em um arquivo .txt, deverá ter um loop (DO WHILE)
     * com um menu de opções.
     * 
     * 1) Cadastrar
     * 2) Listar
     * 3) Pesquisar
     * 4) Excluir
     * 5) Alterar
     * 6) Sair
     * 
     * Avaliação de capacidades:
     * - Elaborar e explicar um (TRY, CATCH, FINALLY)
     * - Uso de JOptionPane ou JFrame ou outros SWING
     * - Elaborar e explicar LocalDateTime
     * - Elaborar e explicar FileWriter
     * - Elaborar e explicar HashMap
     * - Elaborar e explicar Map
     * - Elaborar e explicar a organização do código
     * 
     */

    void main() {

        Map<String, ChavesAmbiente> ambientes = new HashMap<>();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        int op = 0;
        String nomeJanela = ">>>>>>> Dicionário de Chaves <<<<<<<";
        String semCadastro = "Nenhum ambiente cadastrado ainda.";

        do {

            try{
                op = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "\n1) Cadastrar" +
                    "\n2) Listar" +
                    "\n3) Pesquisar" +
                    "\n4) Excluir" +
                    "\n5) Alterar" +
                    "\n6) Sair" +
                    "\n\nDigite o número da opção desejada:\n",
                    nomeJanela, JOptionPane.QUESTION_MESSAGE));
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Digite apenas números!", nomeJanela,
                                JOptionPane.ERROR_MESSAGE);
            }

            switch (op) {
                case 1:
                    String entradaChave = JOptionPane.showInputDialog(null, "Digite nome da chave da sala:",
                            nomeJanela, JOptionPane.QUESTION_MESSAGE);
                    if (entradaChave == null) { // Esse IF serve para verificar se o usuário não digitou nada e fechou a
                        break;                  // janela, então sai do case 1.
                    }
                    String chaveDigitada = entradaChave.toUpperCase();

                    String entradaDescricao = JOptionPane.showInputDialog(null, "Digite a descrição:", nomeJanela,
                            JOptionPane.QUESTION_MESSAGE);
                    if (entradaDescricao == null) {
                        break;
                    }
                    String descricaoDigitada = entradaDescricao;

                    String dataHora = LocalDateTime.now().format(formato);

                    ChavesAmbiente novoObjeto = new ChavesAmbiente(chaveDigitada, descricaoDigitada);

                    if (ambientes.containsKey(chaveDigitada)) {
                        JOptionPane.showMessageDialog(null, "Opa! Essa chave já está cadastrada.", nomeJanela,
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        try (FileWriter arquivo = new FileWriter("chaves_ambientes.txt", true)) {
                            arquivo.write("[" + dataHora + "] " + chaveDigitada + " - " + descricaoDigitada + "\n");
                            JOptionPane
                                    .showMessageDialog(null,
                                            "Chave: " + chaveDigitada + " | Descrição: " + descricaoDigitada
                                                    + "\nCADASTRADO COM SUCESSO!",
                                            nomeJanela, JOptionPane.INFORMATION_MESSAGE);

                            ambientes.put(chaveDigitada, novoObjeto);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, " Erro ao cadastrar chave: " + e.getMessage(),
                                    nomeJanela, JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;

                case 2:
                    if (ambientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, semCadastro, nomeJanela, JOptionPane.WARNING_MESSAGE);
                    } else {
                        String listaCompleta = "LISTA COMPLETA:\n\n";
                        for (String chave : ambientes.keySet()) {
                            ChavesAmbiente ambiente = ambientes.get(chave);
                            listaCompleta += "Chave: " + chave + " | Descrição: " + ambiente.getDescricao() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, listaCompleta, nomeJanela, JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 3:
                    if (ambientes.isEmpty()) { // Verifica se o ambiente está vazio ou seja não tem chave cadastrada
                        JOptionPane.showMessageDialog(null, semCadastro, nomeJanela,
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        String entradaPesquisa = JOptionPane.showInputDialog(null,
                                "Digite a chave que deseja pesquisar:",
                                nomeJanela, JOptionPane.QUESTION_MESSAGE);
                        if (entradaPesquisa == null) {
                            break;
                        }
                        String pesquisa = entradaPesquisa.toUpperCase();

                        if (ambientes.containsKey(pesquisa)) {
                            ChavesAmbiente ambiente = ambientes.get(pesquisa);
                            JOptionPane.showMessageDialog(null,
                                    "Encontrado!\nChave: " + pesquisa + " | Descrição: " + ambiente.getDescricao(),
                                    nomeJanela, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Chave não encontrada.", nomeJanela,
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 4:
                    if (ambientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, semCadastro, nomeJanela, JOptionPane.WARNING_MESSAGE);
                    } else {
                        String entradaExclusao = JOptionPane.showInputDialog(null, "Digite a chave que deseja excluir:",
                                nomeJanela, JOptionPane.QUESTION_MESSAGE);
                        if (entradaExclusao == null) {
                            break;
                        }
                        String chaveExcluir = entradaExclusao.toUpperCase();

                        if (ambientes.containsKey(chaveExcluir)) {
                            ambientes.remove(chaveExcluir);
                            JOptionPane.showMessageDialog(null, "Chave " + chaveExcluir + " excluída com sucesso!",
                                    nomeJanela, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Chave não encontrada para exclusão.", nomeJanela,
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 5:
                    if (ambientes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, semCadastro, nomeJanela, JOptionPane.WARNING_MESSAGE);
                    } else {
                        String entradaAlterar = JOptionPane.showInputDialog(null, "Digite a chave que deseja alterar:",
                                nomeJanela, JOptionPane.QUESTION_MESSAGE);
                        if (entradaAlterar == null) {
                            break;
                        }
                        String chaveAlterar = entradaAlterar.toUpperCase();

                        if (ambientes.containsKey(chaveAlterar)) {
                            String novaDescricao = JOptionPane.showInputDialog(null, "Digite a nova descrição:",
                                    nomeJanela, JOptionPane.QUESTION_MESSAGE);
                            if (novaDescricao == null) {
                                break;
                            }

                            // Atualiza o objeto existente com a nova descrição
                            ChavesAmbiente ambiente = ambientes.get(chaveAlterar);
                            ambiente.setDescricao(novaDescricao);

                            JOptionPane.showMessageDialog(null, "Chave " + chaveAlterar + " alterada com sucesso!",
                                    nomeJanela, JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Chave não encontrada para alteração.", nomeJanela,
                                    JOptionPane.WARNING_MESSAGE);
                        }
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Sistema encerrado!!!", nomeJanela,
                            JOptionPane.CLOSED_OPTION);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha uma opção da lista.", nomeJanela,
                            JOptionPane.WARNING_MESSAGE);
                    break;
            }

        } while (op != 6);

    }
}