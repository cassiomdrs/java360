# Backend - API de Dúvidas (Spring Boot)

Este repositório contém a API REST desenvolvida em **Java** com **Spring Boot** para o recebimento e processamento das dúvidas enviadas pelo aplicativo mobile.

## 📁 Estrutura do Pacote (`br.com.senai.duvidas`)

* **`DuvidasApplication.java`**: Classe principal responsável pela inicialização da aplicação Spring Boot.
* **`DuvidaController.java`**: Controller REST que expõe os endpoints para consumo do aplicativo.
* **`DadosCadastroDuvida.java`**: DTO (Data Transfer Object) implementado como um `record` para mapeamento da dúvida.

## 🛠️ Classes e Funcionalidades

### 1. `DadosCadastroDuvida.java` (DTO)
Representa o objeto de transferência de dados recebido no corpo da requisição. Utiliza o recurso de **Record** do Java para imutabilidade e concisão:
```java
package br.com.senai.duvidas;

public record DadosCadastroDuvida(String duvida) {
}
```

### 2. `DuvidaController.java` (REST Controller)
Classe responsável por escutar e responder às requisições HTTP:

* **`@RestController`**: Define a classe como um controlador REST.
* **`@RequestMapping("/duvida")`**: Define a rota base da API (`/duvida`).
* **`@CrossOrigin(origins = "http://localhost:8081")`**: Habilita o suporte a CORS para permitir requisições originadas do front-end React Native.
* **`@GetMapping`**: Método `mostrarDuvida()` para testes simples de requisições GET.
* **`@PostMapping`**: Método `cadastrar(@RequestBody DadosCadastroDuvida dados)` que recebe o JSON enviado no corpo da requisição POST e imprime o conteúdo no console do servidor.

```java
package br.com.senai.duvidas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/duvida")
@CrossOrigin(origins = "http://localhost:8081")
public class DuvidaController {

    @GetMapping
    public String mostrarDuvida() {
        return "O que é Maven?";
    }

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDuvida dados) {
        System.out.println(dados);
    }
}
```

## 🚀 Como Executar

1. Certifique-se de ter o JDK (Java Development Kit) 21 instalado e configurado.
2. Compile e execute o projeto via terminal/IDE:
   ```bash
   ./mvnw spring-boot:run
   ```
3. O servidor estará rodando na porta `8080` (URL base: `http://localhost:8080/duvida`).