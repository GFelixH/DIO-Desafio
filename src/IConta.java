public interface IConta {
    void sacar(int valor) throws Exception;

    void depositar(int valor);

    void imprimirExtrato();

    void transferir(int valor, Conta contaDestino);
}
