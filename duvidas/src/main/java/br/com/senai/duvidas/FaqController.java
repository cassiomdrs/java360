package br.com.senai.duvidas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FaqController {

    @Autowired
    private DuvidaRepository repository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Construtor para injeção de dependências
    public FaqController(DuvidaRepository repository, CategoriaRepository categoriaRepository) {
        this.repository = repository;
        this.categoriaRepository = categoriaRepository;
    }

    // Envia os dados para o HTML da FAQ
    @GetMapping("/faq")
    public String faq(Model model) {
        model.addAttribute("duvidas", repository.findAllByOrderByDataHoraDesc());
        model.addAttribute("categorias", categoriaRepository.findAll());
        return "faq";
    }

    // Abre a página de cadastro de uma nova categoria
    @GetMapping("/categorias/novo")
    public String formCategoria() {
        return "formulario-categoria";
    }

    // Recebe os dados do formulário e salva a nova categoria no banco
    @PostMapping("/categorias/salvar")
    public String cadastrarCategoria(DadosCadastroCategoria dados) {
        Categoria categoria = new Categoria(dados.nome());
        categoriaRepository.save(categoria);
        return "redirect:/faq";
    }

    // Vincular ou alterar a categoria de uma dúvida específica
    @PostMapping("/faq/vincular-categoria")
    public String vincularCategoria(@RequestParam("duvidaId") Long duvidaId, 
                                    @RequestParam("categoriaId") Long categoriaId) {
        Duvida duvida = repository.findById(duvidaId).orElseThrow(() -> new RuntimeException("Dúvida não encontrada"));
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
        
        duvida.setCategoria(categoria);
        repository.save(duvida);
        
        return "redirect:/faq";
    }

    // Excluir uma dúvida
    @PostMapping("/faq/excluir")
    public String excluir(@RequestParam Long id){
        repository.deleteById(id);
        return "redirect:/faq";
    }

}