import java.util.*;

public class ToolsCesar {
    public static void main(String[] args) throws Exception {

        final int DECALAGE = 3;
        int pos;

        String ligne;
        Scanner entree = new Scanner(System.in);

        System.out.print("Votre chaine à coder : ");
        ligne = entree.nextLine();

        StringBuffer buff;
        char car;
        int i;

        buff = new StringBuffer(ligne);
        for (i = 0; i < buff.length(); i++) {
            car = buff.charAt(i);
            pos = (int) (Character.toLowerCase(car) - (int)'a');
            pos = (pos + DECALAGE) % 26;
            car = (char) ((int)'a'+pos);
            buff.setCharAt(i, car);
        }
        
        ligne= new String(buff);
        System.out.println("Chaine codée : " + ligne);
        entree.close();
        
    }
}