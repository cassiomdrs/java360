public class AlgoritmoDezoitoAl {
    public void main () {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for (int valor : numeros) {
            float resto = valor % 2;
            if (resto == 0) {
                IO.println(valor);
            }
        }
    }
}
