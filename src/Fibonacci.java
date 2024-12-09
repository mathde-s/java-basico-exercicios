import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número e será mostrado x números da sequência de fibonacci");
        int numero = scanner.nextInt();
        fibonacci(numero);
    }
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a);
        for (int i = 1; i < n; i++) {
            System.out.print( " "+b);
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}
