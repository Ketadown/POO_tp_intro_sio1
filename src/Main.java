import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("--Mission 1--");
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre prenom : ");
        String prenom = sc.nextLine();

        System.out.println("Entrez votre nom : ");
        String nom = sc.nextLine();

        System.out.println("Entrez votre annee de naissance : ");
        int anneeDeNaissance = sc.nextInt();

        int age = 2026 - anneeDeNaissance;

        System.out.println(prenom+" "+nom+" a "+age+" ans.");
    }
}