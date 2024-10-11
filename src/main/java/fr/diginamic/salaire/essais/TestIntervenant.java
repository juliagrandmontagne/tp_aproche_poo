package fr.diginamic.salaire.essais;
 import fr.diginamic.salaire.Intervenant;
 import fr.diginamic.salaire.Pigiste;
 import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Intervenant p1 = new Salarie("Michel","Blanc","CDI",2000) {};
        Intervenant p2 = new Pigiste("Michel","Blanc",100,20) {};


        // p1.getSalaire();
        System.out.println(p1.getSalaire());
        System.out.println(p2.getSalaire());

    }
}
