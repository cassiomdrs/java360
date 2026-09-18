public abstract class Animal {

    private String nome;
    private String arquivoSom;

    public Animal(String nome, String arquivoSom){
        this.nome = nome;
        this.arquivoSom = arquivoSom;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setArquivoSom(String arquivoSom) {
        this.arquivoSom = arquivoSom;
    }
    public String getArquivoSom() {
        return arquivoSom;
    }

    public abstract void comer();
    public abstract void tocarSom();
    
}