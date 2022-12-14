import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ClienteCLasse implements ICliente {

    private Set<Integer> numeroContas = new HashSet<>();
    private List<Conta> contas = new LinkedList<Conta>();

    private String endereco;
    private String nome;
    private String sobrenome;

    public ClienteCLasse(String nome, String sobrenome, String endereco) {
        this.endereco = endereco;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public Conta escolheConta(int numero) throws Exception {
        /*
         * Itera pelas contas do cliente e devolve ou null para conta nao encontrada
         * ou Conta com numero correspondido
         */
        Iterator<Conta> iterator = this.contas.iterator();
        while (iterator.hasNext()) {
            Conta contaIterada = iterator.next();
            int numeroIterado = contaIterada.numero;
            if (numero == numeroIterado)
                return contaIterada;
        }
        throw new exceptionConta("Conta não encontrada em escolheConta()");
    }

    @Override
    public void removeConta(int numero) throws Exception {
        /*
         * Encontra conta numero correspondido e exclui da List contas
         */
        Iterator<Conta> iterator = this.contas.iterator();
        while (iterator.hasNext()) {
            Conta contaIterada = iterator.next();
            Integer numeroIterado = contaIterada.numero;
            if (numero == numeroIterado) {
                this.contas.remove(contaIterada);
                this.numeroContas.remove(numero);
            } else
                throw new exceptionConta("Conta não encontrada em removeConta()");
        }
    }

    @Override
    public int criaConta(String tipo) throws Exception {
        /*
         * Cria conta de acordo com o tipo
         */
        int numeroConta = 0;
        boolean procurar = true;
        do {
            Random rand = new Random();
            int d = rand.nextInt(8) + 1;// [1,9]
            int D = rand.nextInt(999) + 1000 * d;// [1000,9999]
            if (!this.numeroContas.contains(D)) {
                procurar = false;
                numeroConta = D;
            }
        } while (procurar);
        if (tipo == "corrente")
            this.contas.add(new ContaCorrente(numeroConta));
        else
            this.contas.add(new ContaPoupanca(numeroConta));
        numeroContas.add(numeroConta);
        return numeroConta;
    }

    public void printaInfoCliente() {
        System.out.println("\nCliente: " + this.nome + ' ' + this.sobrenome +
                "\nEndenreco: " + this.endereco);
    }
}
