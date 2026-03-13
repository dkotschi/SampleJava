package Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReportService {

    public int countLines(Path file) throws IOException {

        if (file == null) {
            throw new IllegalArgumentException("File cannot be null");
        }

        if (!Files.exists(file)) {
            throw new IllegalStateException("File does not exist");
        }

        return Files.readAllLines(file).size();
    }
}