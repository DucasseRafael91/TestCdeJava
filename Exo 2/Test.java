import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int nombre = 0;
        boolean saisieValide = false;

        if (args.length > 0) {
            try {
                nombre = Integer.parseInt(args[0]);
                saisieValide = true;
            } catch (NumberFormatException e) {
                System.out.println("Erreur : l'argument fourni n'est pas un entier !");
            }
        }

        if (!saisieValide) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre entier : ");
            if (scanner.hasNextInt()) {
                nombre = scanner.nextInt();
                saisieValide = true;
            } else {
                System.out.println("Erreur : la valeur saisie n'est pas un entier !");
            }
            scanner.close();
        }

        if (saisieValide) {
            if (nombre > 0) {
                System.out.println("Le nombre est positif.");
            } else if (nombre < 0) {
                System.out.println("Le nombre est négatif.");
            } else {
                System.out.println("Le nombre est nul.");
            }

            if (nombre % 2 == 0) {
                System.out.println("Le nombre est pair.");
            } else {
                System.out.println("Le nombre est impair.");
            }
        }
    }
}
