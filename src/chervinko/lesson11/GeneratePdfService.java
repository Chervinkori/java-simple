package chervinko.lesson11;

import java.io.File;

/**
 * @author chervinko
 * @since 11.03.2024
 */
public class GeneratePdfService extends AbstractGenerateService {
    @Override
    public File generate(byte[] bytes) {
        // ...
        // GeneratePdfService generate
        // ...
        System.out.println("GeneratePdfService generate");
        return new File("/");
    }

    @Override
    public void output(File file) {
        // ...
        // GeneratePdfService output
        // ...
        System.out.println("GeneratePdfService output");
    }
}
