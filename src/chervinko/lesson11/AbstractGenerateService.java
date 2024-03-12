package chervinko.lesson11;

import java.io.File;

/**
 * @author chervinko
 * @since 11.03.2024
 */
public abstract class AbstractGenerateService {
    public byte[] read(File file) {
        // ...
        // AbstractGenerateService read
        // ...
        System.out.println("AbstractGenerateService read");

        return new byte[0];
    }

    public abstract File generate(byte[] bytes);
    public abstract void output(File file);
}
