import java.util.Scanner;

public class Fatotial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número para ser colocado em fatorial");
        int number = scanner.nextInt();
        System.out.println(fatorial(number));
    }
    public static int fatorial(int n){
        int resultado = 1;
        for (int i = 2; i <= n; i++)
            resultado *= i;
        return resultado;
    }
}