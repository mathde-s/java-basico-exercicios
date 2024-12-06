import java.util.Scanner;

public class contagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite números para os digitos serem contados");
        int number = scanner.nextInt();
        if (number < 0){
            String s = Integer.toString(number);
            System.out.println(s.length() - 1);
        } else {
            String s = Integer.toString(number);
            System.out.println(s.length());
        }
    }
}