public class ContaBancaria{
    public static void main(String[] args){
        Conta conta1 = new Conta("Jose", 444444, 333);
        Conta conta2 = new Conta("Flavio", 121212, 222);
        Conta conta3 = new Conta("Joana", 949494, 999);
        Conta conta4 = new Conta("Edgar", 545454, 877);
        Conta conta5 = new Conta("Jenifer", 323552, 122);

        conta1.depositar(1240);
        System.out.println(conta1.getInfoConta());
        System.out.println("Rendimento: "+conta1.getRendimento());
        System.out.println("=============================");
        conta2.depositar(399);
        conta2.sacar(33);
        System.out.println(conta2.getInfoConta());
        System.out.println("Rendimento: "+conta2.getRendimento());
        System.out.println("=============================");
        conta3.depositar(566);
        conta3.sacar(600);
        System.out.println(conta3.getInfoConta());
        System.out.println("Rendimento: "+conta3.getRendimento());
        System.out.println("=============================");
        conta4.depositar(3500);
        System.out.println(conta4.getInfoConta());
        System.out.println("Rendimento: "+conta4.getRendimento());
        System.out.println("=============================");
        conta5.depositar(980);
        conta5.depositar(100);
        System.out.println(conta5.getInfoConta());
        System.out.println("Rendimento: "+conta5.getRendimento());
    }
}


class Conta{
    private int identificador;
    private String titular;
    private int numero;
    private int agencia;
    private int saldo;
    private Data dataDeAbertura;
    private static int numeroDeContas;

    Conta(String titular, int numero, int agencia){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;

        dataDeAbertura = new Data(20, 04, 2024);
        Conta.numeroDeContas++;

        this.identificador = Conta.numeroDeContas;
    }

    String getInfoConta(){
        return "Identificador: "+this.identificador+"\nTitular: "+this.titular+"\nNúmero da conta: "+this.numero+"\nAgência: "+this.agencia+"\nSaldo: R$"+this.saldo+",00"+"\nData de abertura da conta: "+this.dataDeAbertura.formatarData();
    }

    void depositar(int value){
        if(value > 0){
            this.saldo = this.saldo + value;
            System.out.println("Depósito efetuado com sucesso!");
        }else{
            System.out.println("Valor inválido para depósito!");
        }
    }

    void sacar(int value){
        if(value <= this.saldo){
            this.saldo = this.saldo - value;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo indisponível!");
        }
    }

    double getRendimento(){
        return this.saldo * 0.01;
    }
}

class Data{
    private int dia;
    private int mes;
    private int ano;

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String formatarData(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}