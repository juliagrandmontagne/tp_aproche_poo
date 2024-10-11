package fichier;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        boolean exist = Files.exists(path);
        System.out.println(exist);
        List<String> lines = Files.readAllLines(path);
        ArrayList<String> listecent = new ArrayList<String>();
//        List<String> theNewlines ;
        // Path pathFile = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        for (int i = 0; i <100 ; i++) {
//            theNewlines.add(lines.get(i));
           // System.out.println(lines.get(i));
            listecent.add(lines.get(i));
        }
        System.out.println(listecent);
        Path pathCible = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier.txt");
        Files.write(pathCible, listecent);
    }
}
