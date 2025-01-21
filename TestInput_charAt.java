import java.util.Scanner;

public class TestInput_charAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la première chaîne : ");
        String s1 = sc.nextLine();
        System.out.println("Veuillez entrer la deuxième chaîne : ");
        String s2 = sc.nextLine();
        System.out.println("Les deux chaînes commencent-elles par le même caractère ? " + (s1.charAt(0) == s2.charAt(0)));
        sc.close();
    }
}