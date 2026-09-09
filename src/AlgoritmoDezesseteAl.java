public class AlgoritmoDezesseteAl {
    public void main () {
        int i = 0;
        do {
            float resto = i % 2;
            if (resto == 0) {
                IO.println(i);
            }
            i++;
        } while (i <= 200);
    }
}
