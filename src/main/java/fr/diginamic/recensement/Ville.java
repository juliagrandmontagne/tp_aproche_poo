package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fr.diginamic.recensement.Recensement.recuperationVille;

public class Ville {
    String codeRegion;
    String nomDeLaRegion;
    String codeDepartement;
    String codeDeLaCommune;
    String nomDeLaCommune;
    int populationTotale;

    public Ville(String codeRegion, String nomDeLaRegion, String codeDepartement, String codeDeLaCommune, String nomDeLaCommune, int populationTotale) {
        this.codeRegion = codeRegion;
        this.nomDeLaRegion = nomDeLaRegion;
        this.codeDepartement = codeDepartement;
        this.codeDeLaCommune = codeDeLaCommune;
        this.nomDeLaCommune = nomDeLaCommune;
        this.populationTotale = populationTotale;
    }


    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeDeLaCommune() {
        return codeDeLaCommune;
    }

    public void setCodeDeLaCommune(String codeDeLaCommune) {
        this.codeDeLaCommune = codeDeLaCommune;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }
    public static void get10VillesPlusPeupleesFrance() throws IOException {
        List<Ville> dixPlusgrossevilleFrance= new ArrayList<Ville>();
        List<Ville> V1= recuperationVille();

        for (Ville v : V1) {
            if (dixPlusgrossevilleFrance.size() == 0) {
                dixPlusgrossevilleFrance.add(v);
            }
            else {
                boolean trouver = false;
                int j =0;
                int index = -1;
                for (Ville v2 : dixPlusgrossevilleFrance) {
                    if (v2.populationTotale<v.populationTotale){
                        if (trouver == false) {
                            trouver = true;
                            index = j;
                        }
                    }
                    j=j+1;
                }
                if (trouver == false) {
                    dixPlusgrossevilleFrance.add(v);
                } else {
                    dixPlusgrossevilleFrance.add(index, v);
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(dixPlusgrossevilleFrance.get(i).nomDeLaCommune);
        }

    }
    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}
