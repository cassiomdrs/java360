public class AlgoritmoVinteEseteAl {
    public void main () {
        int[] numeros = new int[5];

        // Recebe os valores de cada número
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número na posição " + (i+1) + ": "));
        }

        // Exibi os números inseridos na posição inversa
        for (int i = numeros.length - 1; i >= 0; i--) {
            IO.println("Posição " + (i+1) + " = " + numeros[i]);
        }
    }
}
