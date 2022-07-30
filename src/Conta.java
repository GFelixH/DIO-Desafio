public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1234;

    protected int agencia;
    protected int numero;
    protected int saldo;

    public static int SEQUENCIAL = 1;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
    }

    protected void imprimirInfoComun() {
        System.out.printf("Agencia: %d\nNumero: %d\nSaldo: %d\n", this.agencia, this.numero, this.saldo);
    }

    @Override
    public void sacar(int valor) {
        if (saldo >= valor)
            this.saldo -= valor;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void transferir(int valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }
}
