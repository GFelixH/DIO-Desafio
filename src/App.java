public class App {
    public static void main(String[] args) throws Exception {
        try {
            demo();
        } catch (Exception e) {
            System.out.println("Erro na demo:\n" + e);
        }
    }

    public static void demo() throws Exception {
        // Demo

        System.out.println(
                "\n*********************\n* Clientes E Contas *\n*********************\n\n******************************\n");
        System.out.println("            Demo");

        // Cria cliente
        ClienteCLasse cliente1 = new ClienteCLasse("Alberto", "Roberto", "Rua Tal");

        // Info do cliente criado
        cliente1.printaInfoCliente();

        // Define tipo de conta
        String tipoConta = "poupanca";

        // Cria conta do tipo especificado
        int numeroConta1 = cliente1.criaConta(tipoConta);
        System.out.println("\nConta do tipo " + tipoConta + " cridada\nNumero da conta: " + numeroConta1);

        // Escolhe conta do numero especificado
        Conta minhaConta1 = cliente1.escolheConta(numeroConta1);

        // Depositar e sacar
        minhaConta1.depositar(200000);
        System.out.println("\nDeposito no valor de: 2000,00");
        minhaConta1.sacar(100000);
        System.out.println("Saque no valor de: 1000,00");

        System.out.println("\nConta Acessada");
        minhaConta1.imprimirInfoComun();

        // Deleta conta do numero especificado
        cliente1.removeConta(numeroConta1);
        System.out.println(
                "\nConta de numero: " + numeroConta1 + " sera removida!");
    }
}