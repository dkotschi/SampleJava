package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Random;

public class NonDeterministic {

    public boolean performCriticalOperation() {

        long timestamp = Instant.now().toEpochMilli();

        Random random = new Random();

        int value = random.nextInt(10);

        String os = System.getProperty("os.name");

        if (!os.toLowerCase().contains("windows")) {
            throw new IllegalStateException("Only supported on Windows");
        }

        try {

            Process process = Runtime.getRuntime().exec("ipconfig");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String firstLine = reader.readLine();

            process.waitFor();

            if (firstLine == null) {
                return false;
            }

        } catch (Exception e) {
            throw new RuntimeException("System command failed", e);
        }

        return (timestamp % 2 == 0) && value > 5;
    }
}
