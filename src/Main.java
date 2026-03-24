import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static void main() {
        System.out.println("--Mission 2--");
        Scanner sc = new Scanner(System.in);

        ArrayList<Float> notes = new ArrayList<Float>();

        notes.add(12.5F);
        notes.add(13.0F);
        notes.add(15.0F);
        notes.add(12.0F);
        notes.add(15.0F);
        notes.add(16.0F);

        int taille = notes.size();

        //Affichage avec boucle for :
        for(int i=0; i<taille;i++){
            System.out.println("La note d'indice "+i+" est de : "+notes.get(i));
        }

        //Affichage avec boucle while :
        int i = 0;
        while(i<taille){
            System.out.println("La note d'indice "+i+" est de : "+notes.get(i));
            i++;
        }

    }
}