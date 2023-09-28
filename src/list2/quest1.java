package list2;
import java.util.Scanner;

public class quest1 {

	public static void main(String[] args) {
		
		Scanner z = new Scanner(System.in);
		float num1;
		float num2;
		
		
		
		System.out.println("Digite um numero: ");
		num1 = z.nextFloat();
		
		System.out.println("Digite outro numero: ");
		num2 = z.nextFloat();
		
		while (num2 == 0) {
			
			System.out.println("Digite outro número diferente de zero: ");
			num2 = z.nextFloat();
			
		}
		float resultado = num1 / num2;
		
		System.out.println("O resultado é: " + resultado);
		
		
		z.close();
	}

}