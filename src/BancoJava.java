public class BancoJava {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca(); //POLIMORFISMO

        cc.depositar(200.00);
        cc.imprimirInfoConta();
        cc.sacar(150.00);
        cc.imprimirInfoConta();
        cc.transferir(50.00, cp);
        cp.imprimirInfoConta();
        cc.transferir(50.00, cp);


    }
}