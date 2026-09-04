public class AlgoritmoSeteAl {
    void main () {
        IO.println("Vamos somar dois números inteiros!\n");

        int primeiroNumero = Integer.parseInt(IO.readln("Digite o primeiro número inteiro: "));
        int segundoNumero = Integer.parseInt(IO.readln("Digite o segundo número inteiro: "));
        int soma = primeiroNumero + segundoNumero;

        IO.println("Soma: " + primeiroNumero + " + " + segundoNumero + " = " + soma);
    }
}