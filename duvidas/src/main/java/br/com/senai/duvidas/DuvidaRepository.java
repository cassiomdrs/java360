package br.com.senai.duvidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuvidaRepository extends JpaRepository<Duvida,Long> {

        //Criar método para listar todos
        //Criar métood abstrato para listar todas as dúvidas
    
}
