import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        } else {
            System.out.println("Le nombre est nul.");
        }

        scanner.close();
    }
}
