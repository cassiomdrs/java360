public class AlgoritmoNoveAl {
    void main () {
        IO.println("Vamos calcular a terça parte de um número real!\n");
        double numero = Integer.parseInt(IO.readln("Digite um número real: "));
        double tercaParte = numero / 3;

        IO.println("A terça parte do número é: " + tercaParte);
    }
}
