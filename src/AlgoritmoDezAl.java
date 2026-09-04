public class AlgoritmoDezAl {
    void main () {
        IO.println("Vamos calcular a média de dois números reais!\n");

        double numero1 = Integer.parseInt(IO.readln("Digite o primeiro número: "));
        double numero2 = Integer.parseInt(IO.readln("Digite o segundo número: "));
        double soma = numero1 + numero2;
        double media = soma / 2;

        IO.println("Média:\n" + media);
    }
}
