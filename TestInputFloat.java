import java.util.Scanner;

class TestInputFloat {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer un nombre : "); // "0.12345e4"

        Scanner sc = new Scanner(System.in);

        String output = sc.next();
        Float valFloat = Float.parseFloat​(output);

        System.out.println(valFloat);

        System.out.println("Veuillez entrer un nombre : "); // "1.1"

        output = sc.next();
        Float valFloat2 = Float.parseFloat​(output);

        System.out.println(valFloat+valFloat2);
        sc.close();
    }
}