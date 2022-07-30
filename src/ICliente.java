public interface ICliente {
    int criaConta(String tipo) throws Exception;

    Conta escolheConta(Integer numero) throws Exception;

    void removeConta(Integer numero) throws Exception;
}
