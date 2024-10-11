package fichier;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        boolean exist = Files.exists(path);
        System.out.println(exist);
       // Path pathFile = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        List<String> lines = Files.readAllLines(path);
        System.out.println(lines);
    }
}
