package fr.diginamic.operations;
import fr.diginamic.operations.essais.TestOperations;

public class Operations {
    int a;
    int b;
    char signe;
    public Operations(int a, int b, char signe) {
        this.a = a;
        this.b = b;
        this.signe = signe;
    }
    public int Calcul (int a, int b , char signe)
    {
        this.a = a;
        this.b = b;
        this.signe = signe ;
        char addition = '+' ;
        char soustraction = '-' ;
        char multiplication = '*' ;
        char division = '/' ;
        if ( signe == addition ) {
            return(a+b);
        }
        else if (signe == soustraction )
        {
            return(a-b);
        }
        else if (signe == multiplication )
        {
            return(a*b);
        }
        else if (signe == division )
        {
            return(a/b);
        }
        else
        {
            return(0);
        }
    }
}
