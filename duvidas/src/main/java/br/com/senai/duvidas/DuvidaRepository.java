package br.com.senai.duvidas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DuvidaRepository extends JpaRepository<Duvida,Long> {
    
}
