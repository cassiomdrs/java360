public class Cachorro extends Animal {

    public Cachorro(String comer, String tocarSom) {
        super(comer, tocarSom);
        //TODO Auto-generated constructor stub
    }

    // No processo de herança o construtor não é herdado!
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Ração Camil para Cães");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando auau.mp3");
    }
    
}