public class Algoritmo34 {

    // Encapsulamento - 4 Níveis de encapsulamento que existem
    // public - private - protected - package
    // public = Todo mundo acessa
    // private = Somente a classe pode acessar
    // protected = Apenas as classes autorizadas
    // package = apenas no pacote

    private int primeiroNumero; // Atributo
    private int segundoNumero; // Atributo

    public void setPrimeiroNumero(int primeiroNumero){
        this.primeiroNumero = primeiroNumero;
    }

    public int getPrimeiroNumero(){
        return primeiroNumero;
    }

    public void setSegundoNumero(int segundoNumero){
        this.segundoNumero = segundoNumero;
    }

    public int getSegundoNumero(){
        return segundoNumero;
    }

}