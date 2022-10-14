import java.util.Scanner;

public class Desafio07 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        boolean caracter = validParentheses(scanner.nextLine());

        System.out.println(caracter);
       
    }

    public static boolean validParentheses(String s) {
        char primeiraLetra = s.charAt(0);
        char ultimaLetra = s.charAt(s.length()-1);

        if( primeiraLetra == '(' ){
            if(ultimaLetra == ')')
                return true;
        }
        else if (primeiraLetra == '['){
            if(ultimaLetra == ']')
                return true;
        }
        else if (primeiraLetra == '{'){
            if(ultimaLetra == '}')
                return true;
        }

        return false;
    }

}