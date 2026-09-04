public class AlgoritmoCincoAl {
    void main () {
        int numero = Integer.parseInt(IO.readln("Digite um número inteiro: "));
        int antecessor = numero - 1;
        int sucessor = numero + 1;
        IO.println("O número digitado foi: " + numero);
        IO.println("Seu antecessor é: " + antecessor);
        IO.println("Seu sucessor é: " + sucessor);
    }
}
