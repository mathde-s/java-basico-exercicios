import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número binário para ser convertido a decimal");
        String numero = scanner.next();
        int decimal = Integer.parseInt(numero, 2);
        System.out.println(decimal);
    }
}
