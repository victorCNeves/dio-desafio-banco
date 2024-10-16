public class main {

    public static void main(String[] args) {
        Cliente paulo = new Cliente("paulo","123");
        Cliente jose = new Cliente("jose","124");
        Conta cc = new ContaCorrente(paulo);
        Conta cp = new ContaPoupanca(jose);
        Banco b =  new Banco("JersonBank");
        b.addConta(cc);
        b.addConta(cp);
        System.out.println(b);
        cc.depositar(250.4);
        cp.depositar(74.52);
        System.out.println(b);

        cc.sacar(40.56);
        System.out.println(b);
        cp.transferencia(300.25,cc);
        System.out.println(b);


    }
}
