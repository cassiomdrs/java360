package br.com.senai.duvidas;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DuvidaRepository extends JpaRepository<Duvida,Long> {

        //Criar método para listar todos
        //Criar métood abstrato para listar todas as dúvidas
        List<Duvida> findAllByOrderByDataHoraDesc();
}
