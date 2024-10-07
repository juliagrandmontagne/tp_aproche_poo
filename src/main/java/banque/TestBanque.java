package banque;
import banque.entites.Compte;
public class TestBanque {
    public static void main(String[] args) {
        Compte cpt1 = new Compte (18,51);
        System.out.println(cpt1.getNuméroDeCompte()+cpt1.getSoldeDuCompte());
    }

}
