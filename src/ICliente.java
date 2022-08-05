public interface ICliente {
    int criaConta(String tipo) throws Exception;

    Conta escolheConta(int numero) throws Exception;

    void removeConta(int numero) throws Exception;

}
