public class Metro extends Transporte{

    private static int cont = 0;
    public Metro(){
        cont++;
    }

    public Metro(String placa) {
        super(placa);
    }

    @Override
    public double calcularTarifa(){
        return 5.50;
    }

    public static int getCont(){
        return cont;
    }

}