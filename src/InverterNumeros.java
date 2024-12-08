import java.util.Scanner;

public class InverterNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        String numero = scan.next();
        String reverso = inverterNumero(numero);
        System.out.println("o reverso do número é: " + reverso);
    }
    public static String inverterNumero(String a){
        String resultado = "";
        for(int i = (a.length() -1); i >= 0; i--) // -1 pq o o array começa no 0
            resultado += a.charAt(i); // "quebra" a string e atribui a variavel
        return resultado;
    }
}