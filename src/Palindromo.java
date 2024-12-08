import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número e veja se ele é um palindromo");
        String numero = scanner.next();
        System.out.println(isPalindromo(numero));
    }

    public static boolean isPalindromo(String a) {
        int j = a.length() -1;
        int i = 0;

        while(j > i){
            if (a.charAt(i) != a.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
