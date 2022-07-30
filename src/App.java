public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Cria cliente
        ClienteCLasse cliente1 = new ClienteCLasse("Alberto", "Roberto", "Rua Tal");

        // Define tipo de conta
        String tipoConta = "corrente";

        // Cria conta do tipo especificado
        int numeroConta1 = cliente1.criaConta(tipoConta);
        System.out.println("Conta do tipo " + tipoConta + " cridada\nNumero da conta: " + numeroConta1);

        // acessando set do cliente
        System.out.println(cliente1.numeroContas);

        // acessando list do cliente
        System.out.println(cliente1.contas);

        // Escolhe conta do numero especificado
        Conta minhaConta1 = cliente1.escolheConta(numeroConta1);
        System.out.println(
                "\n\nConta de numero: " + numeroConta1 + " será acessada:\n" +
                        minhaConta1);
    }
}