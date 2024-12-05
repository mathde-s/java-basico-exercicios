import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número e ele será somado a todos os anteriores");
        int number = scanner.nextInt();
        System.out.println(somaDosNumeros(number));
    }
    public static int somaDosNumeros(int a){
        int resultado = 0;

        for (int i = 0; i <= a; i++)
            resultado += i;
        return resultado;
    }
}
