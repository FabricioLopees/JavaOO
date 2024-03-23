public class Main{
    public static void main(String[] args){
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000;

        System.out.println("Saldo atual: R$"+minhaConta.saldo+"0");

        String deposito = minhaConta.depositar(3000);
        String saque = minhaConta.sacar(300);

        System.out.println(deposito+"0");
        System.out.println(saque+"0");
        System.out.println("O saldo atual é: R$"+minhaConta.saldo+"0");
    }
}

class Conta{
    int numero;
    String titular;
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