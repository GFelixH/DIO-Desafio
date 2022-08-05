public class ContaCorrente extends Conta {

    public final String tipo = "Corrente";

    public ContaCorrente(int numero) {
        this.numero = numero;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta corrente:");
        this.imprimirInfoComun();
    }

}
