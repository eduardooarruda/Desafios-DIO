import java.util.Scanner;

public class Desafio09{
    public static void main(String args[]) {
          
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int [] nums = new int[N];

        for (i = 0; i < N; i++)
        {
            nums[i] = input.nextInt();
        }
            
        organizarParesImpares(nums);
  }

  static void organizarParesImpares(int [] nums){
    for(int i = 0; i < nums.length; i++){

        if(nums[i]%2 != 0){

            for(int e = (i+1); e < nums.length; e++){

                if(nums[e]%2 == 0){

                    int aux = nums[e];
                    nums[e] = nums[i];
                    nums[i] = aux; 
                    break; 

                }

            }

        }

        System.out.println(nums[i]);

    }

  }

}