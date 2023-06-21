public class ContaCorrente extends Conta{
    @Override
    protected void imprimirInfoConta() {
        System.out.println("-----------------------------------------------");
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfoConta();
        System.out.println("-----------------------------------------------");
    }
}
