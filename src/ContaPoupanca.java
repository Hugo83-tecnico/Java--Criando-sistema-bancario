public class ContaPoupanca extends Conta{
    @Override
    protected void imprimirInfoConta() {
        System.out.println("-----------------------------------------------");
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfoConta();
        System.out.println("-----------------------------------------------");
    }
}



