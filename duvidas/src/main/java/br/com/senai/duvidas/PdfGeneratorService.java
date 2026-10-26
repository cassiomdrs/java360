package br.com.senai.duvidas;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Serviço responsável por converter strings HTML em arquivos PDF utilizando OpenHTMLtoPDF.
 * Utiliza o Jsoup para garantir que o HTML seja convertido em XHTML bem-formado.
 */
@Service
public class PdfGeneratorService {

    public byte[] generatePdfFromHtml(String htmlContent) {
        // 1. Normaliza o HTML para XHTML estrito (requisito do OpenHTMLtoPDF)
        Document document = Jsoup.parse(htmlContent, "UTF-8");
        document.outputSettings().syntax(Document.OutputSettings.Syntax.xml);
        String xhtmlContent = document.html();

        // 2. Renderiza o XHTML em um fluxo de bytes PDF
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.useFastMode();
            builder.withHtmlContent(xhtmlContent, null);
            builder.toStream(outputStream);
            builder.run();

            return outputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao gerar o arquivo PDF a partir do HTML", e);
        }
    }
}
