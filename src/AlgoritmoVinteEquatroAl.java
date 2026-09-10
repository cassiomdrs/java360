public class AlgoritmoVinteEquatroAl {
    public void main () {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número da variável " + (i+1) + ": "));
        }

        for (int i = 0; i < numeros.length; i++) {
            IO.println("Variável " + (i+1) + " = " + numeros[i]);
        }
    }
}