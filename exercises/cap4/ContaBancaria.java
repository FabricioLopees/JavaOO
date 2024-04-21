public class ContaBancaria {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        conta1.titular = "Fabricio Lopes";
        conta1.numero = 121212121;
        conta1.agencia = 2222;
        
        
        conta1.dataDeAbertura = new Data();
        conta1.dataDeAbertura.dia = 19;
        conta1.dataDeAbertura.mes = 04;
        conta1.dataDeAbertura.ano = 2024;


        conta1.depositar(1000);
        conta1.sacar(200);
        System.out.println("Rendimento: "+conta1.calcularRendimento());
        conta1.recuperarDadosParaImpressao();

       
    }
}


class Conta{
    String titular;
    int numero;
    int agencia;
    int saldo;
    Data dataDeAbertura;

    void sacar(int value){
        if(value <= saldo){
            this.saldo = this.saldo - value;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Saldo abaixo do valor desejado!");
        }
    }

    void depositar(int value){
        this.saldo = this.saldo + value;
        System.out.println("Depósito efetuado com sucesso!");
    }

    double calcularRendimento(){
        return (this.saldo * 0.01);
    }

    void recuperarDadosParaImpressao(){
        System.out.println("Titular: "+this.titular);
        System.out.println("Número da conta: "+this.numero);
        System.out.println("Agência: "+this.agencia);
        System.out.println("Saldo: R$"+this.saldo+",00");
        System.out.println("Data de abertura da conta: "+this.dataDeAbertura.formartarData());
    }
}

class Data{
    short dia;
    int mes;
    int ano;

    String formartarData(){
        return this.dia+"/"+this.mes+"/"+this.ano;
    }
}