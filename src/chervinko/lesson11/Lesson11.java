package chervinko.lesson11;

import java.io.File;

/**
 * @author chervinko
 * @since 11.03.2024
 */
public class Lesson11 {
    public static void main(String[] args) {
        // Представим, что данный метод является неким фронт-приложением (клиентом),
        // а вызовы методов "клик" пользователя по кнопке
        generatePdf(new File("/"));
        generateDocx(new File("/"));
    }

    public static void generatePdf(File file) {
        AbstractGenerateService service = new GeneratePdfService();
        generateAndOutput(service, file);
    }

    public static void generateDocx(File file) {
        AbstractGenerateService service = new GenerateDocxService();
        generateAndOutput(service, file);
    }

    public static void generateAndOutput(AbstractGenerateService service, File file) {
        byte[] bytes = service.read(file);
        File newFile = service.generate(bytes);
        service.output(newFile);
    }
}
