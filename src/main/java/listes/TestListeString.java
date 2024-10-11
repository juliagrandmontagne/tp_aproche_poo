package listes;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste,"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
        String villePlusGrand  = "";
        for (String ville:liste){
            if ( ville.length() > villePlusGrand.length()) {
                villePlusGrand =ville;
            }
        }
        System.out.println(villePlusGrand);
        for(int i = 0; i < liste.size(); i++)
       {
            String VILLEMAJ = liste.get(i).toUpperCase();
            liste.set(i,VILLEMAJ);
        }
        System.out.println(liste);
        liste.removeIf(ville -> ville.startsWith("N"));
        System.out.println(liste);

    }

}
