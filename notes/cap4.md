# Capítulo 4 - Orientação a Objetos Básica

**Classe**

Um escopo que define quais serão as características do(s) objeto(s) que serão gerados a partir desta classe.

**Objeto**

Uma instância de uma classe. Pode possuir atributos e comportamentos, das quais são definidos anteriormente na Classe.

### Classes e Objetos em Java


```Java
public class Main{
    public static void main(String[] args){
        Conta minhaConta = new Conta(); // cria o objeto minhaConta
                
        minhaConta.depositar(2750);
        minhaConta.sacar(930);

        System.out.println("O saldo atual é: R$"+minhaConta.saldo+"0");
    }
}

class Conta{
    String titular;
    int numero;
    double saldo;

    String sacar(double quantidade){
        this.saldo -= quantidade;
        return "Saque no valor de: R$"+quantidade;
    }

    String depositar(double quantidade){
        this.saldo += quantidade;
        return "Depósito no valor de R$"+quantidade;
    }
}
```

A instrução: `Conta minhaConta = new Conta()` define a variável `minhaConta` com o tipo `Conta`, em seguida, com o comando `= new Conta()` atribui a esta variável uma instância da classe `Conta`.

Esta é chamada uma **variável de referência**, pois ela não armazena o objeto criado. Quando usamos a palavra-chave `new`, a JVM faz a alocação de memória dinamicamente, armazena este novo objeto e retorna o endereço de memória que ele está armazenado, este endereço é então armazenado na variável `minhaConta`. Por isso ela é chamada de variável de refência, pois ela faz uma referência ao objeto que está alocado na memória.