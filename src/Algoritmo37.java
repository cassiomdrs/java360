public class Algoritmo37 {
    void main() {
        /*
        Exemplo Didático
            - Herança
            - super()
            - Redefinição do Construtor
            - Polimorfismo
            - Sobrescrita (override)
            - Sobrecarga (overload)
        */

        Cachorro c = new Cachorro("Max", "Latido", "Ração");
        Gato g = new Gato("Tom", "Miau", "Ração");
        JavaPorco j = new JavaPorco("Pumba", "Grunindo", "Plantas");

        IO.println("O nome do cachorro é: " + c.getNome());
        c.arquivoSom();
        c.comer();

        IO.println("O nome do gato é: " + g.getNome());
        g.arquivoSom();
        g.comer();

        IO.println("O nome do Java Porco é: " + j.getNome());
        j.arquivoSom();
        j.comer();

        //Tocar o som de verdade wav
        //
    }
}