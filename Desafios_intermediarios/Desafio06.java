import java.util.Scanner;;

public class Desafio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        palindroma(palavra);

    }

    static void palindroma(String palavra){
        int tam = palavra.length() - 1;

        for(int i = 0; i <= tam; i++){
            if(palavra.charAt(i) == palavra.charAt(tam-i)){
                continue;
            }else{
                System.out.println("FALSE");
                return;
            }
        }
        System.out.println("TRUE");

    }
}
