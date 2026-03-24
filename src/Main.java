import java.util.ArrayList;

public class Main {
    static void main() {
        System.out.println("--Mission 3--");

        ArrayList<Float> notes = new ArrayList<Float>();

        notes.add(12.5F);
        notes.add(13.0F);
        notes.add(15.0F);
        notes.add(12.0F);
        notes.add(15.0F);
        notes.add(16.0F);

        int taille = notes.size();
        float somme = 0;

        //Affichage avec boucle for :
        for(int i=0; i<taille;i++){
            somme = somme + notes.get(i);
        }

        float moyenne = somme/taille;

        System.out.println("La moyenne de l'étudiant est de : "+moyenne+"/20.");

        if(moyenne>=10){
            System.out.println("Eleve admis.");
        }
        else{
            System.out.println("Eleve non admis.");
        }
    }
}