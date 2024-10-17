package fr.diginamic.recensement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fr.diginamic.recensement.Recensement.recuperationVille;

public class Departement {
    String NumeroDeDepartement;
    int nombreTotalHabitant;
    //listeville
    List<Ville> villeParDepartement = new ArrayList<Ville>();

    public Departement(String numeroDeDepartement) {
        this.nombreTotalHabitant = 0;
        this.NumeroDeDepartement = numeroDeDepartement;
    }
    public Departement ajoutVilleDansDepartement (Ville V1){
        this.nombreTotalHabitant = this.getNombreTotalHabitant() + V1.populationTotale;
        int i = 0;
        int index =-1;
        boolean trouver = false;
        for (Ville villeIndex : this.villeParDepartement) {
            if ((villeIndex.populationTotale < V1.populationTotale) && (trouver == false)) {
                index = i;
                trouver = true;
            }
            i=i+1;
        }

        if ((trouver == false)){

            this.villeParDepartement.add(V1);
        }
        else{
            this.villeParDepartement.add(index, V1);
        }
        return this;
    }

    public static ArrayList<Departement> remplissageDepatement(List<Ville> villes) throws IOException {
        ArrayList<Departement> departement = new ArrayList<Departement>();
        boolean trouver = false;
        int index = -1;
        for (Ville villeIndex : villes) {
            trouver = false;

            for (int i = 0; i < departement.size(); i++) {
                if (villeIndex.codeDepartement.equals(departement.get(i).NumeroDeDepartement)) {
                    trouver = true;
                    index = i;
                }
            }
            if (trouver) {
                departement.get(index).ajoutVilleDansDepartement(villeIndex);
            }
            else {
                Departement D1 = new Departement(villeIndex.codeDepartement);
                departement.add(D1);

                departement.get(departement.size()-1).ajoutVilleDansDepartement(villeIndex);

            }
        }
        return departement;
    }

    public static void getHabitantsParDepartement() throws IOException {

        List<Ville> V1= recuperationVille();
        ArrayList<Departement> departement = remplissageDepatement(V1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tapper le code departement");
        String codeDepartementDemander = scanner.nextLine();

        int indexdemander = -1;
        for (int i = 0; i < departement.size(); i++) {
            if (departement.get(i).NumeroDeDepartement.equals(codeDepartementDemander)) {
                indexdemander = i;
            }
        }
        if (indexdemander == -1) {
            System.out.println("Le departement demmandé n'est pas dans la liste");
        }
        else {
            System.out.println(departement.get(indexdemander).nombreTotalHabitant);
        }
    }

    public static void get10VillesPlusPeupleesDepartement() throws IOException {
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
    public static void get10DepartementPlusPeuplees() throws IOException {
        List<Departement> dixPlusgrosseDepartement= new ArrayList<Departement>();

        List<Ville> V1= recuperationVille();
        ArrayList<Departement> departement = remplissageDepatement(V1);


        for (Departement d : departement) {
            System.out.println(d.NumeroDeDepartement + " " + departement.size());
            if (dixPlusgrosseDepartement.size() == 0) {
                dixPlusgrosseDepartement.add(d);
            }
            else {
                boolean trouver = false;
                int j =0;
                for (Departement r2 : dixPlusgrosseDepartement) {
                    if (r2.nombreTotalHabitant<d.nombreTotalHabitant){
                        if (trouver == false) {
                            trouver = true;
                            dixPlusgrosseDepartement.add(j, d);
                        }
                    }
                    j=j+1;
                }

                if (trouver == false) {
                    dixPlusgrosseDepartement.add(d);
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(dixPlusgrosseDepartement.get(i).NumeroDeDepartement);

        }
    }

    public List<Ville> enregistrementVillepardepartement (){

        return villeParDepartement;
    }
    public List<Ville> getVilleParDepartement() {
        return villeParDepartement;
    }

    public void setVilleParDepartement(List<Ville> villeParDepartement) {
        this.villeParDepartement = villeParDepartement;
    }

    public String getNumeroDeDepartement() {
        return NumeroDeDepartement;
    }

    public void setNumeroDeDepartement(String numeroDeDepartement) {
        NumeroDeDepartement = numeroDeDepartement;
    }

    public int getNombreTotalHabitant() {
        return nombreTotalHabitant;
    }

    public void setNombreTotalHabitant(int nombreTotalHabitant) {
        this.nombreTotalHabitant = nombreTotalHabitant;
    }

    public static void main(String[] args) throws IOException{
        //getHabitantsParDepartement();
        get10DepartementPlusPeuplees();
    }
}
