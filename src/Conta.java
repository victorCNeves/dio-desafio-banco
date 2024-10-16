import java.util.Objects;

public class Conta {
    private static final int PADRAO_AGENCIA = 1;
    private static int SEQUENCIAL=1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = PADRAO_AGENCIA;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean sacar(double valor){
        if(this.saldo>valor){
            this.saldo-=valor;
            return true;
        }else{
            return false;
        }
    }

    public void depositar(double valor){
        this.saldo+=valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }

    public void transferencia(double valor, Conta conta){
        this.sacar(valor);
        if(sacar(valor)) {
            conta.depositar(valor);
        }
    }

}
