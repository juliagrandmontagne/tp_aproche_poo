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
    public static ArrayList<Ville> remplissageVille(List<Ville> villes) throws IOException {
        ArrayList<Ville> ville = new ArrayList<Ville>();
        boolean trouver = false;
        int index = -1;
        for (Ville villeIndex : villes) {
            trouver = false;

            for (int i = 0; i < villes.size(); i++) {
//                if (villeIndex.nomDeLaCommuneequals(ville.get(i).NumeroDeDepartement)) {
//                    trouver = true;
//                    index = i;
//                }
            }
            if (trouver) {
                //ville.get(villeIndex);
            }
            else {
                Ville v1 = new Ville(villeIndex);
                ville.add(v1);

               // villes.get(villes.size()-1).ajoutVilleDansDepartement(villeIndex);

            }
        }
        return ville;
    }
    public static void get10VillesPlusPeupleesFrance() throws IOException {
        List<Ville> dixPlusgrossevilleDepartement= new ArrayList<Ville>();

        List<Ville> V1= recuperationVille();
        ArrayList<Departement> departement = remplissageDepatement(V1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le code departement");
        String departement_demander = scanner.nextLine();

        int indexdemander = -1;
        for (int i = 0; i < departement.size(); i++) {
            if (departement.get(i).NumeroDeDepartement.equals(departement_demander)) {
                indexdemander = i;
            }
        }
        if (indexdemander == -1) {
            System.out.println("Le departement demmandé n'est pas dans la liste");
        }
        else {
            System.out.println(departement.get(indexdemander).villeParDepartement.size());
            for (Ville v : departement.get(indexdemander).villeParDepartement) {
                if (dixPlusgrossevilleDepartement.size() == 0) {
                    dixPlusgrossevilleDepartement.add(v);
                }
                else {
                    boolean trouver = false;
                    int j =0;
                    for (Ville v2 : dixPlusgrossevilleDepartement) {
                        if (v2.populationTotale<v.populationTotale){
                            if (trouver == false) {
                                trouver = true;
                                dixPlusgrossevilleDepartement.add(j, v);
                            }
                        }
                        j=j+1;

                    }
                    if (trouver == false) {
                        dixPlusgrossevilleDepartement.add(v);
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(dixPlusgrossevilleDepartement.get(i).nomDeLaCommune);
            }
        }
    }
    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}
