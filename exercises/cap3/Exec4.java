// Imprima os fatoriais de 1 a 10

public class Exec4{
	public static void main(String[] args){
		int num = 1;
		
		while(num <= 10){
		
			long numFatorial = num;
			
			for(int i = 1; i < num; i++){

				numFatorial = numFatorial * (num - i);


			}

			System.out.println("O fatorial de "+num+" = "+numFatorial);
			num++;
			
		}
		
	}
}