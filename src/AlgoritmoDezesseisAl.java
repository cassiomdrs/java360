public class AlgoritmoDezesseisAl {
    public void main () {
        int i = 0;
        while (i <= 200) {
            float resto = i % 2;
            if (resto == 0) {
                IO.println(i);
            }
            i++;
        }
    }
}
