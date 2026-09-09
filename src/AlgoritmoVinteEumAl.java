public class AlgoritmoVinteEumAl {
    public void main () {
        int[] numeros = {45,67,89,34,23,56,78,98,45,34};
        float soma = 0;
        int qtd = 0;

        for (int valor : numeros) {
            soma = soma + valor;
            qtd++;
        }
        IO.println("Valores totais: " + soma);
        float media = soma / qtd;
        IO.println("Média: " + media);
    }
}
