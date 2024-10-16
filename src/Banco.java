import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<Conta>();
    }

    public void addConta(Conta conta){
        this.contas.add(conta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
