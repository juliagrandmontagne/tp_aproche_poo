package fichier;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectureFichierVille {
    public static void main (String[] args) throws IOException {
        ArrayList<String> Ville = new ArrayList<String>();
        Path path = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        List<String> Recensement =  Files.readAllLines(path);
//        for (int i = 1; i <Recensement.size() ; i++) {
//            String[] tokens = Recensement.split(";");
//        }
    }
}
