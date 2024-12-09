import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número");
        int number = scanner.nextInt();
        System.out.println("agora digite o exoente");
        int expoente = scanner.nextInt();
        System.out.println(potencia(number, expoente));
    }

    public static int potencia(int a, int b){
        int resultado = 1;
        for (int i = 0; i < b; i++) {
            resultado *= a;
        }
        return resultado;
    }
}
