import java.util.*;

public class ToolsPalindrome {
    public static void main(String[] args) throws Exception {

        int longueur;

        String ligne;
        Scanner entree = new Scanner(System.in);

        System.out.print("Votre chaine : ");
        ligne = entree.nextLine();

        StringBuffer buff;
        char car;
        boolean palindrome = true;

        buff = new StringBuffer(ligne);
        longueur = buff.length();
        for (int i = 0; i < buff.length()/2+1; i++) {
            car = buff.charAt(i);
            if (car != buff.charAt(longueur-i-1)) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
        entree.close();
        
    }
}