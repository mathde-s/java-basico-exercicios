import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número e será mostardo todos os seus divisores");
        int numero = scanner.nextInt();
        multiplos(numero);
    }

    public static void multiplos(int a){
        int resultado = 1;
        int i = 1;
        while(i <= a){
            if(a % i == 0)
                System.out.print(i +", ");
            i++;
        }
    }
}
