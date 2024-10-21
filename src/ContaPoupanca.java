public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public String extrato(){
        return "Extrato da Conta Poupança:"+ super.toString();
    }
}
