package list2;

import java.util.Scanner;

public class quest2 {

	public static void main(String[] args) {
		
		   Scanner z = new Scanner(System.in);
	        float num1;
	        float num2;

	        System.out.println("Digite o primeiro valor: ");
	        num1 = z.nextFloat();

	        do {
	            System.out.println("Digite outro valor: ");
	            num2 = z.nextFloat();
	            
	        } while (num2 == 0);
	            float res = num1 / num2;
	            System.out.println(res);
	            
	        z.close();
	            

	}

}