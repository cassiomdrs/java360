public class Principal {
    void main(){
        // Objeto é uma instância de uma classe

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

        Algoritmo33 abrirPorta = new Algoritmo33();
        abrirPorta.chave();
        
    }
}
