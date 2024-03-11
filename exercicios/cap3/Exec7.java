/*
Escreva um programa em que, dada uma variável x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
 ° Se x é par, x = x / 2;
 ° Se x é ímpar, x = x * 3 + 1;
 ° Imprime x;
 ° O programa deve parar quando x tiver o valor final de 1. Por exemplo, para x = 13, a saída será: 
 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
*/

public class Exec7{
	public static void main(String[] args){
		int num = 13;

		while(num > 1){
			if(num % 2 == 0){			// se for par
			
				num = num / 2;

			}else{						// se for ímpar

				num = num * 3 + 1;

			}

			System.out.print(num+"; ");
		}
	}
}