import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestConectividad {
    public void conectividad() throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ping", "-w", "5", "8.8.8.8");

        Process p = pb.start();

        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line;

        while ((line = input.readLine()) != null) {
            System.out.println(line);

        }

    }
}
