package listes;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);
        System.out.println(liste.size());
//        for(int i = 0; i < liste.size(); i++)
//        {
//            System.out.println(liste.get(i));
//        }
        System.out.println(liste);
        System.out.println(Collections.max(liste));
        System.out.println(Collections.min(liste));
         liste.remove(Collections.min(liste));
        System.out.println(liste);
//        int max = Integer.max(liste);
//        System.out.println(max);
    }


}
