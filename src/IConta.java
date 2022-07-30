public interface IConta {
    void sacar(int valor);

    void depositar(int valor);

    void imprimirExtrato();

    void transferir(int valor, Conta contaDestino);
}
