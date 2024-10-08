package fr.diginamic.operations;

public class CalculMoyenne {
    public double [] tableau = new double [0];
//            {15.00,10.00,5.00};
    //   {1.5, 2.7, 3.2, 4.8, 5.1}

    double ajout;

    public CalculMoyenne(double[] tableau, double ajout) {
        this.tableau = tableau;
    }
    public double[] ajout (double ajout)
    {
        double [] arrayCopy = new double[tableau.length+1];
        for (int i = 0; i < tableau.length; i++) {
            arrayCopy[i] = tableau [i];
            System.out.println(arrayCopy[i]);
        }
        arrayCopy[tableau.length] = ajout;

        tableau = arrayCopy;
        return tableau;
    }
    public double calcul () {
        this.tableau = tableau;
        //Quelle est la moyenne des éléments du tableau ?
        double somme = 0.0;

        {
        //on ajoute les données du tableau
        for ( int i = 0; i < tableau.length; i++)
        {
            somme = somme+ tableau[i];
        }
        //on divise par le nombre de valeur
        System.out.println(somme/tableau.length);
        return (somme/tableau.length);
        }

    }
}
