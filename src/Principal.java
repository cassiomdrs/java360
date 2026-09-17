public class Principal {
    void main(){
        // Objeto é uma instância de uma classe
        /*
        //classe    obj    a op  constutor
        Algoritmo31 objeto = new Algoritmo31();
        IO.println(objeto.getAloMundo());
        objeto.printaNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        
        String nome = IO.readln("Digite seu nome: ");
        objeto2.mostrarSalaEco(nome);

        objeto2.mostrarSalaEco("JP Max Plus");

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala(nome)); 
        
        Algoritmo33 testeDaChave = new Algoritmo33();
        testeDaChave.inserirChave(Integer.parseInt(IO.readln("Digite o número da chave: ")));
        IO.println(testeDaChave.abrirPorta());
        

        Algoritmo34 alg34 = new Algoritmo34();
        alg34.setPrimeiroNumero(10);
        alg34.setSegundoNumero(20);
        IO.println(alg34.getPrimeiroNumero());
        IO.println(alg34.getSegundoNumero());
        */
        
        Algoritmo35 alg35 = new Algoritmo35();
        alg35.setModelo("Fiat Uno Mille");
        alg35.setPlaca("JGV-2588");
        alg35.setCavalos(76);
        IO.println("Modelo: " + alg35.getModelo());
        IO.println("Placa: " + alg35.getPlaca());
        IO.println("Cavalos: " + alg35.getCavalos());

        Algoritmo36 alg36 = new Algoritmo36();
        alg36.setHoraVisita(14);
        alg36.setMinutoVisita(30);
        IO.println("Horário de visita: " + alg36.getHoraVisita() + ":" + alg36.getMinutoVisita() + "h");
        
    }
}
