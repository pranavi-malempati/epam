package maven;

import java.util.Scanner;

public class  sweets {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
      
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            int n = input.nextInt();
            int c = input.nextInt();
            int m = input.nextInt();
            
            int ate = 0;
            
            int sweets = n / c;
            
            ate += sweets;

            while(sweets >= m)
            {
                ate += sweets / m;
                sweets = (sweets / m) + (sweets % m);
            }
            System.out.println(ate);
        }
    }
}