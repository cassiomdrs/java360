public class Algoritmo32 {
    
    public void mostrarSalaEco(String nome){
        IO.println("Quem ousa entrar na Sala do Eco?");
        IO.println("Ah... " + nome + ". Eu esperava por você.");
    }
    public String mostrarSala(String nomeA){
        String res = "Quem ousa entrar na Sala do Eco?";
        String resNome = "Ah... " + nomeA + ". Eu esperava por você.";
        return res + "\n" + resNome;
    }
}
