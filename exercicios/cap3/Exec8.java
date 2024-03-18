public class Exec8{
	public static void main(String[] args){
		/* 
		Imprima a seguinte tabela usando for s encadeados:
		1
		2 4
		3 6 9
		4 8 12 16
		n n*2 n*3 .... n*n
		*/

		for(int y = 1; y <= 10; y++){
			for(int x = 1; x <= y; x++){
				System.out.print(y*x+" ");
			}
			System.out.println(" ");
		}
	}
}