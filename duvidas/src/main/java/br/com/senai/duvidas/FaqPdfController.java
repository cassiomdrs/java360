package br.com.senai.duvidas;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para download e visualização do PDF das dúvidas/FAQ.
 */
@RestController
@RequestMapping("/api/faq")
public class FaqPdfController {

    private final FaqExportService faqExportService;

    public FaqPdfController(FaqExportService faqExportService) {
        this.faqExportService = faqExportService;
    }

    /**
     * Endpoint GET para gerar e baixar/visualizar o PDF do FAQ.
     * Exemplo de acesso: GET http://localhost:8080/api/faq/pdf
     */
    @GetMapping("/pdf")
    public ResponseEntity<byte[]> baixarFaqPdf() {
        byte[] pdfBytes = faqExportService.gerarFaqPdf();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);

        // "inline" exibe no navegador; se quiser forçar o download direto no disco, troque por "attachment"
        headers.setContentDispositionFormData("inline", "faq-duvidas.pdf");
        headers.setContentLength(pdfBytes.length);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");

        return ResponseEntity.ok()
                .headers(headers)
                .body(pdfBytes);
    }
}
