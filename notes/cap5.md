# Capítulo 5 - Modificadores de Acesso e Atributos de Classe

#### Modificador de acesso
Um modificador de acesso serve para definir limites para acessar um determinado atributo ou método em um objeto. Por exemplo, em um objeto do tipo Conta, podemos definir o atributo saldo como privado, para que ele não possa ser modificado diretamente mas somente usando os métodos de saque e depósito.

```Java

public class Main{
	public static void main(String[] args){
		Conta conta = new Conta();

		conta.depositar(100);
		System.out.println(conta.getSaldo());
	}
}

class Conta{
	private double saldo;

	public void sacar(double valor){
		this.sado = this.saldo - valor;
	}

	public void depositar(double valor){
		this.saldo = this.saldo + valor;
	}

	public double getSaldo(){
		return this.saldo;
	}
}

```

Resultado


```
100
```

Definir o saldo como um atributo privado, nos ajuda a manter a integridade do mesmo, isto é, podemos adicionar aos métodos *sacar* e *depositar* verificadores que farão a checagem do tipo: conferir se o saldo disponível é igual ou maior ao valor desejado para saque, verificar se o valor de depósito não é negativo, etc. Isto traz controle a aplicação, e força o dado fornecido pelo usuário a passar por uma verificação antes de executar a operação, mesmo que este não tenha ciência deste verificador.

```Java

public class Main{
	public static void main(String[] args){
		Conta conta = new Conta();

		conta.depositar(100);
		conta.sacar(200);
	}
}

class Conta{
	private double saldo;

	public void sacar(double valor){
		if(this.possuiSaldo(valor)){
			this.sado = this.saldo - valor;
			System.out.println("Saque efetuado com sucesso!");
		}else{
			System.out.println("Saldo indisponível!");
		}
	}

	public void depositar(double valor){
		if(this.isPositivo(valor)){
			this.saldo = this.saldo + valor;
			System.out.println("Depósito efetuado com sucesso!");
		}else{
			System.out.println("Valor inválido para depósito!");
		}
		
	}

	private boolean isPositivo(double valor){
		// retorna true caso o valor seja positivo (maior que zero)
		// retorna false caso o valor seja negativo (menor ou igual a zero)
		return valor > 0;
	}

	private boolean possuiSaldo(double valor){
		// retorna true caso o valor seja igual ou maior que o saldo
		// retorna false caso o valor seja maior que saldo
		return valor <= this.saldo;
	}

	// outros métodos...
}

```

Resultado

```
Depósito efetuado com sucesso!
Saldo indisponível!
```

#### Interface

A interface são os métodos que podem ser acessados de fora do objeto, eles são a forma de nos comunicar com o objeto desta classe.

#### Encapsulamento

Encapsulamento é o ato de agrupar atributos e métodos correlatos, além de ocultar informações de um objeto e seu funcionamento.

#### Getters e Setters

São formas de o usuário interagir com os atributos que não podem ser acessado diretamente. São métodos utilizados para setar ou obter dados.

#### Contrutores

É uma forma de definir qual será o comportamento de um objeto quando ele for instanciado.

#### Static

O static torna um atributo ou método um atributo ou método da classe, portando podem ser acessados sem mesmo instanciar um objeto dessa classe. E os objetos instanciados de uma classe que contém atributos do tipo *static* compartilham esse mesmo atributo, com o mesmo valor.