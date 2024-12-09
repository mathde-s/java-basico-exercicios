import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número e será mostardo todos os seus multiplos");
        int numero = scanner.nextInt();
        System.out.println("agora digite o limite dos multiplos");
        int limite = scanner.nextInt();
        multiplos(numero,limite);
    }

    public static void multiplos(int a, int b){
        int resultado = 1;
        for (int i = 1; resultado < b; i++) {
            resultado = a * i;
            System.out.print(resultado + ", ");
        }
    }
}
