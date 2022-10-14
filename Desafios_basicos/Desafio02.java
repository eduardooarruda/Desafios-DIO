import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        int A, N, soma = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for(int i = A; i <= N; i+=A){
            soma += i;
        }

        System.out.println(soma);
    }
}