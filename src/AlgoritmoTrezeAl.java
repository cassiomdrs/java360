public class AlgoritmoTrezeAl {
    void main () {
        // Crie um algoritmo usando if , else if encadeado. O algoritmo inicialmente vai pedir para
        // o usuário digitar um número. Depois ele vai pedir para digitar um segundo número. Sua missão
        // é criar uma lógica no algoritmo que identifique qual é o número maior e menor. Ao final mostre
        // que é o maior e o menor.

        int numeroUm = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        int numeroDois = Integer.parseInt(IO.readln("Digite o segundo número: "));

        if (numeroUm > numeroDois) {
            IO.println("O número " + numeroUm + " é MAIOR que o número " + numeroDois + "!");
        }
        else if (numeroUm < numeroDois) {
            IO.println("O número " + numeroUm + " é MENOR que o número " + numeroDois + "!");
        }
        else {
            IO.println("O número " + numeroUm + " é IGUAL ao número " + numeroDois + "!");
        }
    }    
}
