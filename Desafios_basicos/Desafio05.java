import java.util.Scanner;

public class Desafio05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int numero = leitor.nextInt();

        buscaSequencial(elementos, numero);

    }

    static void buscaSequencial(int[] elementos, int numero){
        for(int i = 0; i < elementos.length; i++ ){
            if(elementos[i] == numero){
                System.out.printf("Achei %d na posicao %d ", numero, i);
                return;
            }
        }
        System.out.printf("Numero %d nao encontrado! ", numero);
    }
}