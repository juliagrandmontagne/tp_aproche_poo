package maps;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class MapVilles {
    public static void main(String[] args) throws IOException  {
        Path path = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        boolean exist = Files.exists(path);
        //ArrayList<String> listevilles= Files.readAllLines(path);
        HashMap<Integer, String> villes = new HashMap<Integer, String>();
        System.out.println(exist);
    }
}
