import java.util.Scanner;

public class TestInputWith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la première chaîne : ");
        String s1 = sc.nextLine();
        System.out.println("Veuillez entrer la deuxième chaîne : ");
        String s2 = sc.nextLine();

        System.out.println("s1 commence-t-elle par s2 ? " + s1.startsWith(s2));
        System.out.println("s1 finit-t-elle par s2 ? " + s1.endsWith(s2));
        System.out.println("s1 contient-elle s2 ? " + s1.contains(s2));
        sc.close();
    }
}