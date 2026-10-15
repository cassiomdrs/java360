package br.com.senai.duvidas;

// Se não colocar a anottation é uma classe comum.
// Preciso importar uma anottation de Controller.
// Rota de um sistema web
// API Web - RESTFull
//import org.springframework.stereotype.Controller;
//@Controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping ("/duvida")
@CrossOrigin (origins="http://localhost:8081") //CORS

public class DuvidaController {
    
    @GetMapping  
    public String mostrarDuvida(){
        return "O que é Maven?";
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDuvida dados){
        IO.println(dados);
    }

}
