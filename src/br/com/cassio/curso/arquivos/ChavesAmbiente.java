package br.com.cassio.curso.arquivos;

public class ChavesAmbiente {
    private String chave;
    private String descricao;
    
    public ChavesAmbiente() {
    }

    public ChavesAmbiente(String chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString (){
        return "Chave: " + chave + " | Descrição: " + descricao;
    }
}
