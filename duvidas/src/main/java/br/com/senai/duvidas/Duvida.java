package br.com.senai.duvidas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import java.time.LocalDateTime;
import java.time.ZoneId;

// Classe de entidade (Representa uma tabela)
@Table(name = "duvida")
@Entity(name = "Duvida")
public class Duvida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String texto;
    
    @Column(columnDefinition = "TEXT")
    private String resposta;
    
    @Column(name="data_hora")
    private LocalDateTime dataHora;

    // Relacionamento de Muitas Dúvidas para Uma Categoria
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Duvida() {}

    public Duvida(DadosCadastroDuvida dados) {
        this.texto = dados.texto();
    }

    @PrePersist
    public void prePersist() {
        this.dataHora = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Getters e Setters para a Categoria
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}