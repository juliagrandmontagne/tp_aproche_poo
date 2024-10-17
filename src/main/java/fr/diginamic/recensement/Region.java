package fr.diginamic.recensement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static fr.diginamic.recensement.Recensement.recuperationVille;

public class Region {
    String numeroDeRegion;
    int nombreTotalHabitant;
    String NomRegion;
    List<Ville> villeParRegion= new ArrayList<Ville>();


    public Region(String numeroDeRegion, String nomRegion) throws IOException {
        this.numeroDeRegion = numeroDeRegion;
        this.nombreTotalHabitant = 0;
        this.NomRegion = nomRegion;
        this.villeParRegion = new ArrayList<Ville>();
    }

    public Region ajoutVilleDasnRegions (Ville V1){
        this.nombreTotalHabitant = this.getNombreTotalHabitant() + V1.populationTotale;
        int i = 0;
        int index =-1;
        boolean trouver = false;
        for (Ville villeIndex : this.villeParRegion) {
            if ((villeIndex.populationTotale < V1.populationTotale) && (trouver == false)) {
               index = i;
               trouver = true;
            }
            i=i+1;
        }

        if ((trouver == false)){

            this.villeParRegion.add(V1);
        }
        else{
            this.villeParRegion.add(index, V1);
        }
        return this;
    }

    public static ArrayList<Region> remplissageRegions(List<Ville> villes) throws IOException {
        ArrayList<Region> region = new ArrayList<Region>();
        boolean trouver = false;
        int index = -1;
        for (Ville villeIndex : villes) {
            trouver = false;

            for (int i = 0; i < region.size(); i++) {
                if (villeIndex.nomDeLaRegion.equals(region.get(i).NomRegion)) {
                    trouver = true;
                    index = i;
                }
            }
            if (trouver) {
                region.get(index).ajoutVilleDasnRegions(villeIndex);
            }
            else {
                Region R1 = new Region(villeIndex.codeRegion, villeIndex.nomDeLaRegion);
                region.add(R1);

                region.get(region.size()-1).ajoutVilleDasnRegions(villeIndex);

            }
        }
        return region;
    }
    // à amélliorer
    public static List<Ville> getVilleParRegion() throws IOException {
        List<Ville> villeParRegion= new ArrayList<Ville>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le nom de la région");
        String regionDemander = scanner.nextLine();
        List<Ville> V1= recuperationVille();
        for (Ville ville : V1) {
            // Vérifie si la région demandée correspond à la région de la ville
            if (ville.nomDeLaRegion.equalsIgnoreCase(regionDemander)) {
                villeParRegion.add(ville);

            }
        }
        return villeParRegion;
    }

    public static void getHabitantsParRegion() throws IOException {

        List<Ville> V1= recuperationVille();
        ArrayList<Region> region = remplissageRegions(V1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le nom de la region");
        String region_demander = scanner.nextLine();

        int indexdemander = -1;
        for (int i = 0; i < region.size(); i++) {
            if (region.get(i).NomRegion.equals(region_demander)) {
                indexdemander = i;
            }
        }
        if (indexdemander == -1) {
            System.out.println("La region demmandé n'est pas dans la liste");
        }
        else {
            System.out.println(region.get(indexdemander).nombreTotalHabitant);
        }
    }

    public static void get10VillesPlusPeupleesRegion() throws IOException {
        List<Ville> dixPlusgrossevilleRegion= new ArrayList<Ville>();

        List<Ville> V1= recuperationVille();
        ArrayList<Region> region = remplissageRegions(V1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le nom de la region");
        String region_demander = scanner.nextLine();

        int indexdemander = -1;
        for (int i = 0; i < region.size(); i++) {
            if (region.get(i).NomRegion.equals(region_demander)) {
                indexdemander = i;
            }
        }
        if (indexdemander == -1) {
            System.out.println("La region demmandé n'est pas dans la liste");
        }
        else {
            System.out.println(region.get(indexdemander).villeParRegion.size());
            for (Ville v : region.get(indexdemander).villeParRegion) {
                if (dixPlusgrossevilleRegion.size() == 0) {
                    dixPlusgrossevilleRegion.add(v);
                }
                else {
                    boolean trouver = false;
                    int j =0;
                    for (Ville v2 : dixPlusgrossevilleRegion) {
                        if (v2.populationTotale<v.populationTotale){
                            if (trouver == false) {
                                trouver = true;
                                dixPlusgrossevilleRegion.add(j, v);
                            }
                        }
                        j=j+1;

                    }
                    if (trouver == false) {
                        dixPlusgrossevilleRegion.add(v);
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(dixPlusgrossevilleRegion.get(i).nomDeLaCommune);

            }

        }
    }

    public static void get10RegionsPlusPeuplees() throws IOException {
        List<Region> dixPlusgrosseRegion= new ArrayList<Region>();

        List<Ville> V1= recuperationVille();
        ArrayList<Region> region = remplissageRegions(V1);


        for (Region r : region) {
            System.out.println(r.NomRegion + " " + region.size());
            if (dixPlusgrosseRegion.size() == 0) {
                dixPlusgrosseRegion.add(r);
            }
            else {
                boolean trouver = false;
                int j =0;
                for (Region r2 : dixPlusgrosseRegion) {
                    if (r2.nombreTotalHabitant<r.nombreTotalHabitant){
                        if (trouver == false) {
                            trouver = true;
                            dixPlusgrosseRegion.add(j, r);
                        }
                    }
                    j=j+1;
                }

                if (trouver == false) {
                    dixPlusgrosseRegion.add(r);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(dixPlusgrosseRegion.get(i).NomRegion);

        }
    }

    public void setVilleParRegion(List<Ville> villeParRegion) {
        this.villeParRegion = villeParRegion;
    }

    public String getNomRegion() {
        return NomRegion;
    }

    public void setNomRegion(String nomRegion) {
        NomRegion = nomRegion;
    }

    public String getNumeroDeRegion() {
        return numeroDeRegion;
    }

    public void setNumeroDeRegion(String numeroDeRegion) {
        this.numeroDeRegion = numeroDeRegion;
    }

    public int getNombreTotalHabitant() {
        return nombreTotalHabitant;
    }

    public void setNombreTotalHabitant(int nombreTotalHabitant) {
        this.nombreTotalHabitant = nombreTotalHabitant;
    }

    public static void main(String[] args) throws IOException{
//        List<Ville> V1= recuperationVille();
//        ArrayList<Region> region = remplissageRegions(V1);
//        getHabitantsParRegion();
//        System.out.println("Le premier élément est: " + region.get(0).numeroDeRegion);
//        System.out.println("Le premier élément est: " + region.get(0).NomRegion);
//        get10VillesPlusPeupléesRegion();
         get10RegionsPlusPeuplees();


    }
}
