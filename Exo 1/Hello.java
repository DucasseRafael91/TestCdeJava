import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // pour lire l’entrée utilisateur

        System.out.println("Bonjour et bienvenue dans mon programme Java !");
        System.out.print("Quel est votre nom ? ");

        String nom = scanner.nextLine(); // lit la ligne saisie par l’utilisateur

        System.out.println("Salut " + nom + " !");
        
        scanner.close(); // bonne pratique : fermer le scanner
    }
}
