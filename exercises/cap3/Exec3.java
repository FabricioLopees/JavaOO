// 3. Imprima todos os múltiplos de 3, entre 1 e 100.

public class Exec3{
	public static void main(String[] args){
		int num = 3;
		for(int i = 1; i <= 100; i++){

			// Se o número divido por 3 tiver resto 0, então ele é multiplo de 3 e deverá ser printado na tela.
			if(i % 3 == 0){ 
			
				System.out.println(i);
			}
		}
	}
}