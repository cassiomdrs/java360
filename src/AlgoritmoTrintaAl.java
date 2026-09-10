public class AlgoritmoTrintaAl {
    public void main () {
        int numeroFatorial = Integer.parseInt(IO.readln("Digite o número que deseja descobrir o fatorial: "));
        int[] decremento = new int [numeroFatorial];
        int calcular = 1;

        for (int i = decremento.length - 1; i >= 0; i--) {
            decremento[i] = i+1;
            calcular = calcular * decremento[i];
            IO.println("Posição " + (i+1) + " = " + decremento[i]);
        }
        IO.println("Resultado: " + calcular);
    }
}
