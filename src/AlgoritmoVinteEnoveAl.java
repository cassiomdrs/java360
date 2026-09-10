public class AlgoritmoVinteEnoveAl {
    public void main () {
        float[] mes = new float[12];
        float vendasTotais = 0;
        int contagem = 0;

        for (int i = 0; i < mes.length; i++) {
            mes[i] = Integer.parseInt(IO.readln("Insira as vendas do mês " + (i+1) + ": "));
        }

        for (int i = 0; i < mes.length; i++) {
            vendasTotais = mes[i] + vendasTotais;
            contagem++;
        }

        float media = vendasTotais / contagem;

        IO.println("\n*** TOTAL EM VENDAS DURANTE O ANO ***");
        IO.println("R$ " + vendasTotais);

        IO.println("\n*** MÉDIA DE VENDAS MENSAL ***");
        IO.println("R$ " + media);
    }
}
