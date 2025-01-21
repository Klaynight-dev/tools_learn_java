import java.util.Scanner;

public class TestInputVille {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer le nom d'une ville : ");
        String city = sc.nextLine().trim();
        System.out.println(city.toUpperCase());
        sc.close();
    }
}