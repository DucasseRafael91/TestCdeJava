import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Bonjour et bienvenue dans mon programme Java !");

        System.out.print("Quel est votre nom ? ");
        String nom = scanner.nextLine();

	System.out.print("Quel est votre prenom ? ");
        String prenom = scanner.nextLine();  

        System.out.println("Salut " + nom + " " + prenom + " !");
        
        scanner.close();
    }
}
