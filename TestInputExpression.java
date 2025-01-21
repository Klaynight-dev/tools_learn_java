import java.util.Scanner;

public class TestInputExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la première chaîne : ");
        String s1 = sc.nextLine();
        System.out.println("Veuillez entrer la deuxième chaîne : ");
        String s2 = sc.nextLine();

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1.equals(s2) : " + s1.equals(s2));
        System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2));
        System.out.println("s1.compareToIgnoreCase(s2) : " + s1.compareToIgnoreCase(s2));
        sc.close();
    }
}