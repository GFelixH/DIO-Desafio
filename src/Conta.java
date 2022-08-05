public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1234;

    protected int agencia;
    protected int numero;
    protected int saldo;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
    }

    protected void imprimirInfoComun() {
        System.out.printf("Agencia: %d\nNumero: %d\nSaldo: %S\n", this.agencia, this.numero, saldoFormatado());
    }

    @Override
    public void sacar(int valor) throws Exception {
        if (saldo >= valor)
            this.saldo -= valor;
        else
            throw new exceptionConta("Valor maior que o saldo");
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void transferir(int valor, Conta contaDestino) {
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return this.saldo;
    }

    private String saldoFormatado() {
        int x = this.saldo;
        String saldoInteiro = Integer.toString(x / 100);
        String saldoDecimal;
        if (x % 100 == 0)
            saldoDecimal = "00";
        else
            saldoDecimal = Integer.toString(x % 100);
        return saldoInteiro + ',' + saldoDecimal;
    }
}
