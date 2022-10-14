import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        
        int somatorio = somatorio(numero);

        System.out.println(somatorio);
    }


    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
