package fr.diginamic.jdr;
import fr.diginamic.jdr.Personnage;
import fr.diginamic.jdr.Creature;
public class Combat {
    public static void main(String[] args) {
        Personnage p1 = new Personnage() {};
        p1.afficherstat();
        int attaqueCreature=0;
        int degats =0;
        int attaquePersonnage=0;
       while(p1.getPointDeVie() >0)
       {
           Creature crea = new Creature((int) ((3 * Math.random()) + 1));
           crea.afficherstat();

           //boucle de combat
           while(p1.getPointDeVie() >0 && crea.getPointDeVie() >0)
           {
               //crea.afficherstat();
               attaqueCreature = crea.getForce() +(int) ((10 * Math.random()) + 1);
               attaquePersonnage = p1.getForce() +(int) ((10 * Math.random()) + 1);
               if (attaqueCreature>attaquePersonnage)
               {
                   System.out.println("!!!!!La creature gagne le round!!!!!!!!!!");
                   degats = attaqueCreature-attaquePersonnage;
                   p1.setPointDeVie(p1.getPointDeVie()-degats);
                   if (p1.getPointDeVie() < 0)
                   {
                       p1.setPointDeVie(0);
                   }
                   System.out.println("il reste "+p1.getPointDeVie()+" point de vie au personnage");
                   if (p1.getPointDeVie() == 0)
                   {System.out.println("votre personnage meure");}
               }
               else if (attaqueCreature == attaquePersonnage) {
                   System.out.println("!!!!!!!!!!!!!Personne ne gagne le round!!!!!!!!!!!!!!!");

               } else
               {
                   System.out.println("!!!!!!!!!!Le combatant gagne le round!!!!!!!!!!!!");
                   degats = attaquePersonnage-attaqueCreature;
                   crea.setPointDeVie(crea.getPointDeVie()-degats);
                   if (crea.getPointDeVie() < 0)
                   {
                       crea.setPointDeVie(0);}
                   System.out.println("il reste "+crea.getPointDeVie()+" point de vie a la créature");
                   if (crea.getPointDeVie() == 0)
                   {
                       System.out.println("la creature est morte");

                       if (crea.getEspece().compareTo("troll") == 0){
                           p1.setScore(p1.getScore()+5);
                       }
                       else if (crea.getEspece().compareTo("gobelin") == 0) {
                           p1.setScore(p1.getScore()+2);
                       }
                       else {
                           p1.setScore(p1.getScore()+1);
                       }

                   }
               }
           }
           System.out.println("le score de votre partie est de "+p1.getScore());
       }
    }
}
