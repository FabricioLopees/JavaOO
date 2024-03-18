public class Desafio{
	public static void main(String[] args){
		/* DESAFIOS: FIBONACCI
		   Faça o exercício da série de Fibonacci usando apenas duas variáveis.
		 */

		int number = 0; // variável que armazena o número anterior a 'n'
		int newNumber = 0; // variável que amarzena o valor de 'n'
		
		// O loop é para definir um limite para a sequência de Fibonacci
		while(newNumber <= 100){
			
			if(newNumber == 0){

				// se 'newNumber' for igual a 0 então:

				// printe na tela
				System.out.print(newNumber" ");
				
				// salve o valor 1 em 'newNumber'
				newNumber = 1;
			}else{

				// se 'newNumber' não for igual a zero, então:
				
				// gere um novo número e salve em 'newNumber'
				newNumber = newNumber + number;

				// faça a conta reversa para saber qual era o número anterior e armaze em 'number'
				number = newNumber - number;
			}

			// printe na tela o valor de 'newNumber'
			System.out.print(newNumber+" ");
		}
	}
}