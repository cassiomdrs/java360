public class AlgoritmoQuinzeAl {
    public void main () {
        for (int i = 0; i <=200; i++) {
            float resto = i % 2;
            if (resto == 0) {
                IO.println(i);
            }
        }
    }
}