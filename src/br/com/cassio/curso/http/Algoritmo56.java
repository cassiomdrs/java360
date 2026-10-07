package br.com.cassio.curso.http;

import java.net.URI; // URL - www.google.com
import java.net.http.HttpClient; // Cliente (Objeto)
import java.net.http.HttpRequest; // Solicitar uma requisição
import java.net.http.HttpResponse; // Retorna a resposta da requisição

public class Algoritmo56 {
    public static void main(String[] args) {
        // URL da API para buscar as raças dos gatos
        String url = "https://api.thecatapi.com/v1/breeds";
        // Criando o cliente HTTP moderno nativo do Java
        HttpClient client = HttpClient.newHttpClient();
        // Construindo a requisição GET
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Accept", "application/json")
                // Se tiver uma API Key, descomente a linha abaixo:
                .header("x-api-key",
                        "live_nGKLJhxZ1QPu5gx9XSZ15jcvgUPHZQOeF2aYkDuIr82zIoUN9fOLXsOszWSxakAK")
                .GET()
                .build();
        try {
            // Enviando a requisição de forma síncrona
            HttpResponse<String> response = client.send(
                    request,
                    HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                System.out.println("Resposta da API:");
                System.out.println(response.body());
                // Dica: Para extrair a URL de forma elegante, você
                // uma biblioteca como Jackson ou Gson, ou fazer um
            } else {
                System.out.println("Erro na requisição: " +
                        response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}