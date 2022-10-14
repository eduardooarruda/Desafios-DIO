import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
    
        if(A == B){
            System.out.println("Sao iguais!");
        }
        else{
            System.out.println("Nao sao iguais! ");
        }
    }
}
