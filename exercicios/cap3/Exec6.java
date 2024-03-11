// Imprima	os	primeiros	números	da	série	de	Fibonacci	até	passar	de	100


public class Exec6{

	public static void main(String[] args){

		int numero = 0;
		int numeroAnterior = 0;
		int novoNumero = 0;

		while(numero <=150){
			System.out.print(numero+"; ");

			if(numero == 0){
				numero = 1;								  // inicia a sequência
			}else{
				novoNumero = numero + numeroAnterior;     // calcula o próximo número da sequência
				numeroAnterior = numero;                  // atualiza o valor do número anterior
				numero = novoNumero;					  // atualiza o valor do número atual
			}
		}
	}
}