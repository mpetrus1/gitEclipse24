import java.util.Scanner;

public class InventariBotiga {

    public static void main(String[] args) {
        // Definir la taula per emmagatzemar la informació de 3 productes: Nom, Quantitat, Preu.
        String[][] productes = new String[3][3];

        // Scanner per obtenir l'entrada de l'usuari
        Scanner scanner = new Scanner(System.in);

        // Omplir la informació de la taula
        for (int i = 0; i < productes.length; i++) {
            System.out.println("Introduïu la informació per al producte " + (i + 1) + ":");

            // Nom del producte
            System.out.print("Nom del producte: ");
            productes[i][0] = scanner.nextLine();

            // Quantitat en estoc
            System.out.print("Quantitat en estoc: ");
            productes[i][1] = scanner.nextLine();

            // Preu per unitat
            System.out.print("Preu per unitat: ");
            productes[i][2] = scanner.nextLine();
        }

        // Mostrar l'inventari complet amb el valor total per producte
        System.out.println("\nInventari de la botiga:");
        System.out.println("Nom\t\tQuantitat\tPreu per unitat\tTotal");

        // Variable per calcular el valor total de l'inventari
        double valorTotalInventari = 0;

        // Recórrer la taula per calcular i mostrar el total per producte
        for (int i = 0; i < productes.length; i++) {
            String nom = productes[i][0];
            int quantitat = Integer.parseInt(productes[i][1]);
            double preu = Double.parseDouble(productes[i][2]);
            double totalProducte = quantitat * preu;

            // Sumar el total del producte al valor total de l'inventari
            valorTotalInventari += totalProducte;

            // Mostrar la informació del producte
            System.out.printf("%-10s\t%-10d\t%-15.2f\t%.2f\n", nom, quantitat, preu, totalProducte);
        }

        // Mostrar la quantitat total de l'inventari
        System.out.printf("\nValor total de l'inventari: %.2f\n", valorTotalInventari);

        // Tancar el scanner
        scanner.close();
    }
}
