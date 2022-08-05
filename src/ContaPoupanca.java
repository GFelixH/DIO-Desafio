public class ContaPoupanca extends Conta {

    public final String tipo = "Poupanca";

    public ContaPoupanca(int numero) {
        this.numero = numero;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta poupança:");
        this.imprimirInfoComun();
    }
}