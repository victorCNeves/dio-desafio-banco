import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        Set<Cliente> clienteSet = new HashSet<Cliente>();

        clienteSet.add(new Cliente("paulo","123"));
        clienteSet.add(new Cliente("jose","124"));
        clienteSet.add(new Cliente("gabriela","748"));
        clienteSet.add(new Cliente("celso","124"));

        Conta cc = new ContaCorrente(getSet("123",clienteSet));
        Conta cp = new ContaCorrente(getSet("748",clienteSet));
        Conta cc2 = new ContaCorrente(getSet("124",clienteSet));

        Banco b = new Banco("Bank");
        b.addConta(cc);
        b.addConta(cp);
        b.addConta(cc2);

        System.out.println(b);

        cc.depositar(2000);
        cp.depositar(100);
        cc2.depositar(240);

        cc.transferir(1500, cc2);

        cp.transferir(500, cc);

        System.out.println(b);
    }

    public static Cliente getSet(String cpf, Set<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            if ((cliente.getCpf()).equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}