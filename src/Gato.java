public class Gato extends Animal {

    public Gato(String comer, String tocarSom) {
        super(comer, tocarSom);
        //TODO Auto-generated constructor stub
    }

    // No processo de herança o construtor não é herdado!
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Leite especial para gatos");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando miau.mp3");
    }
    
}