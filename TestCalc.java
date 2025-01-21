import java.util.Scanner;

public class TestCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;
        double angle;

        final String COSINE = "C";
        final String SINE = "S";
        final String TANGENT = "T";
        final String QUIT = "Q";

        do {
            System.out.println("Menu:");
            System.out.println("C : calcul d’un cosinus");
            System.out.println("S : calcul d’un sinus");
            System.out.println("T : calcul d’une tangente");
            System.out.println("Q : quitter le programme");
            System.out.print("Choisissez une option: ");
            choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case COSINE:
                    System.out.print("Entrez la valeur de l'angle en radians: ");
                    angle = Double.valueOf(scanner.nextLine()).doubleValue();
                    System.out.println("Cosinus: " + Math.cos(angle));
                    break;
                case SINE:
                    System.out.print("Entrez la valeur de l'angle en radians: ");
                    angle = Double.valueOf(scanner.nextLine()).doubleValue();
                    System.out.println("Sinus: " + Math.sin(angle));
                    break;
                case TANGENT:
                    System.out.print("Entrez la valeur de l'angle en radians: ");
                    angle = Double.valueOf(scanner.nextLine()).doubleValue();
                    System.out.println("Tangente: " + Math.tan(angle));
                    break;
                case QUIT:
                    System.out.println("Quitter le programme.");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (!choice.equals("Q"));

        scanner.close();
    }
}