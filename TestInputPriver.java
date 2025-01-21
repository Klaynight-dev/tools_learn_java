import java.util.Scanner;

public class TestInputPriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez entrer la première chaîne : ");
        String s1 = sc.nextLine();
        System.out.println("Veuillez entrer la deuxième chaîne : ");
        String s2 = sc.nextLine();

        if (s1.contains(s2)) {
            System.out.println(s1.substring(0, s1.indexOf(s2)) + s1.substring(s1.indexOf(s2)+s2.length(), s1.length()));
        } else {
            System.out.println(s1);     
        }
        
        sc.close();
    }
}