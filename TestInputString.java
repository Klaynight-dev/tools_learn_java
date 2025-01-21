import java.util.Scanner;

class TestInputString {
    public static void main(String[] args) {
        System.out.println("Veuillez entrer un nombre : "); // "12345"
        Scanner sc = new Scanner(System.in);
        String output = sc.next();
        int valint = Integer.parseInt​(output);
        System.out.println(valint);
    }
}