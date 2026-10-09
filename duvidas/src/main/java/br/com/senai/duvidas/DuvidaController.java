package br.com.senai.duvidas;

// Se não colocar a anottation é uma classe comum.
// Preciso importar uma anottation de Controller.
// Rota de um sistema web
// API Web - RESTFull
//import org.springframework.stereotype.Controller;
//@Controller
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping ("/duvida")
public class DuvidaController {
    
    @GetMapping  
    public String mostrarDuvida(){
        return "<center><h1 style=\"color: #a200ff;\">O que é Maven?</h1></center>";
    }

}
