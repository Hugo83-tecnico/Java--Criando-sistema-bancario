public abstract class Cliente implements iConta{
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    @Override
    public void depositar(double valor) {

    }
    @Override
    public void sacar(double valor) {

    }
    @Override
    public void transferir(double valor, Conta destino) {

    }
}
