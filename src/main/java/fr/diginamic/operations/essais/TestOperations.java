package fr.diginamic.operations.essais;
import banque.entites.Compte;
import fr.diginamic.operations.Operations;
public class TestOperations {
    public static void main(String[] args) {
        Operations Op1 = new Operations(5,3,'+');
        Operations Op2 = new Operations(8,3,'-');

        System.out.println(Op1.Calcul(5,3,'-'));
    }
}
