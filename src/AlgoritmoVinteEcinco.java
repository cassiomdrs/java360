public class AlgoritmoVinteEcinco {
    public void main () {
        int[] numeros = new int[5];

        // Preenchendo os números de 5 variáveis
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número na pisição " + (i+1) + ": "));
        }

        // Exibindo o dobro dos números inseridos
        for (int i = 0; i < numeros.length; i++) {
            IO.println("O dobro do número da posição " + (i+1) + " = " + (numeros[i] * 2));
        }
    }
}