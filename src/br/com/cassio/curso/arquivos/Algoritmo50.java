package br.com.cassio.curso.arquivos;
public class Algoritmo50 {
    void main (){ // método main
        try { // Tentar
            int idade = Integer.parseInt(IO.readln("Qual sua idade? "));
            String resultado = (idade >= 18) ? "Maior" : "Menor";
            IO.println(resultado);
        } catch (NumberFormatException e){
            // Erro
            // e.getMessage() = quando estiver na web use print() console()
            IO.println("ÔÔÔ Mula, isso não é um número!");
        } finally {
            // Conclusão (Independe se deu certo ou errado)
            // Janelinha Windows (do lado 'fn') "."
            IO.println("Encerrando o sistema!");
        };

    }
}
