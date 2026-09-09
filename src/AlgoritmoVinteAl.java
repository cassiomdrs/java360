import java.util.List;

public class AlgoritmoVinteAl {
    public void main () {
        List<String> cupons = List.of ("PROMO10","DESCONTO20","FRETEGRATIS","PIX5");
        IO.println("CUPONS ATIVOS NO MOMENTO:");
        cupons.forEach(IO::println);
    }
}
