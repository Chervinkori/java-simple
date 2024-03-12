package chervinko.lesson11;

import java.io.File;

/**
 * @author chervinko
 * @since 11.03.2024
 */
public class GenerateDocxService extends AbstractGenerateService {
    @Override
    public File generate(byte[] bytes) {
        // ...
        // GenerateDocxService generate
        // ...
        System.out.println("GenerateDocxService generate");
        return new File("/");
    }

    @Override
    public void output(File file) {
        // ...
        // GenerateDocxService output
        // ...
        System.out.println("GenerateDocxService output");
    }
}
