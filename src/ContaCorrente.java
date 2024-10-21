public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public String extrato(){
        return "Extrato da Conta Corrente:\n"+ super.toString();
    }
}
