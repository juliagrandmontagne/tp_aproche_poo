package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement  {
    public static List<Ville> recuperationVille() throws IOException{
        Path path = Paths.get("/Users/juliagrandmontagne/Documents/Code/approche-objet/src/main/java/fichier/recensement.csv");
        List<Ville> ville = new ArrayList<Ville>();
        List<String> lines = Files.readAllLines(path);
        for (int i = 1; i < lines.size(); i++) {
            String firstline = lines.get(i);
            String[] morceaux = firstline.split(";");
            Ville laville =new Ville(morceaux[0],morceaux[1],morceaux[2],morceaux[5],morceaux[6],Integer.parseInt(morceaux[9].replace(" ","")));
            ville.add(laville);
        }
        return ville;
    }
    public static void main(String[] args)  throws IOException {
        List<Ville> V1= recuperationVille();
        System.out.println(V1.size());
    }
}
