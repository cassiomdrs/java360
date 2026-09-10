public class AlgoritmoVinteEoitoAl {
    public void main () {
        int[] numeros = new int[5];

        // Recebe os valores de cada numero
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número na posição " + (i+1) + ": "));
        }

        // Exibi os números pares encontrado
        IO.println("\n*** NÚMEROS PARES ENCONTRADO ***");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                IO.println("Posição " + (i+1) + " = " + numeros[i]);
            }
        }
    }
}
